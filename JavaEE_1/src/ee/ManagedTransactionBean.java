package ee;

import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;

@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class ManagedTransactionBean {

    @PersistenceContext
    EntityManager manager;

    @Resource
    UserTransaction transaction;

    public void saveStudent() {
        try {
            transaction.begin();
            manager.persist(new Student("newSlava"));
            transaction.commit();
        } catch (HeuristicMixedException e) {
            e.printStackTrace();
        } catch (HeuristicRollbackException e) {
            e.printStackTrace();
        } catch (RollbackException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        }
    }
}
