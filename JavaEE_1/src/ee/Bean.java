package ee;

import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.sql.DataSourceDefinitions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@DataSourceDefinitions(
        @DataSourceDefinition(
                name = "myDataSourceTest",
                url = "jdbc:mysql://localhost:3306/Testing",
                className = "com.mysql.jdbc.Driver",
                user = "root",
                password = "root"
        )
)
public class Bean {

    @PersistenceContext(unitName = "example")
    EntityManager manager;

    public void saveStudent(Student student) {
        manager.persist(student);
    }
}
