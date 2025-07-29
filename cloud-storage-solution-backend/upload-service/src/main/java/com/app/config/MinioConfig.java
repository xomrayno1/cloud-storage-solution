package com.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;

@Configuration
public class MinioConfig {
	
	public static final String UPLOAD_BUCKET_NAME = "upload";

    @Value("${minio.url}")
    private String minioUrl;

    @Value("${minio.username}")
    private String minioUsername;

    @Value("${minio.password}")
    private String minioPassword;

    @Bean
    public MinioClient minioClient() throws Exception {
        MinioClient client = MinioClient.builder()
                .endpoint(minioUrl)
                .credentials(minioUsername, minioPassword)
                .build();
        if (!client.bucketExists(BucketExistsArgs.builder().bucket(UPLOAD_BUCKET_NAME).build())) {
            client.makeBucket(
                    MakeBucketArgs
                            .builder()
                            .bucket(UPLOAD_BUCKET_NAME)
                            .build()
            );
        }
        return client;
    }

}
