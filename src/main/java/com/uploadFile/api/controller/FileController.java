package com.uploadFile.api.controller;

import com.uploadFile.api.entity.FileResponse;
import com.uploadFile.api.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {
    @Value("${project.image}")
    private String path;
    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<?> fileUpload(@RequestParam("files") List<MultipartFile> files) throws IOException {
        List<FileResponse> response = new ArrayList<>();
        response = fileService.uploadFile(files);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
