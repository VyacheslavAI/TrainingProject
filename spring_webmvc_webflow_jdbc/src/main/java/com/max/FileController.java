package com.max;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.io.IOException;

@Controller
public class FileController {

    @GetMapping("/file")
    public String getForm() {
        return "file";
    }

    @PostMapping("/file")
    @ResponseBody
//    public String processRegistration(@RequestPart MultipartFile file) throws IOException {
    public String processRegistration(@RequestPart Part file) throws IOException {
//        return new String(file.getBytes());

        file.write(file.getSubmittedFileName());

        return "successful";
    }
}
