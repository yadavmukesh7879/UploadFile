package com.uploadFile.api.serviceImpl;

import com.uploadFile.api.entity.FileResponse;
import com.uploadFile.api.repositories.FileRepository;
import com.uploadFile.api.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl  implements FileService {
    @Autowired
    private FileRepository fileRepository;
    @Override
    public List<FileResponse> uploadFile( List <MultipartFile> files) throws IOException {
        ArrayList<FileResponse> listOfResponse = new ArrayList<>();

        for (MultipartFile file : files) {

            FileResponse fileResponse = new FileResponse();
            fileResponse.setName(file.getName());
            fileResponse.setContent(file.getBytes());

            FileResponse save = fileRepository.save(fileResponse);

        }


        return listOfResponse;
    }
}
