package com.uploadFile.api.repositories;

import com.uploadFile.api.entity.FileResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileResponse,Long> {
}
