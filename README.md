Techstack: spring/mysql/react/docker/minio|aws <br>

Upload & File Management: <br>
- POST /upload/initiate -> start a new file upload session and return an upload id
- PUT /upload/{id}/put -> uploads a chunk for the give upload id
- POST /upload/{id}/complete -> finalizes upload, assembles file triggers post-processing

File Retrieval & Metadata <br> 
- GET /files/{field} - downloads the file with access control checks
- GET /files/{field}/metadata - fetchs file metada , version history, permisision

Sharing & Collaboration <br>
- POST /files/{field}/share -> creates a shareable link (public/private)
- GET /file/shared/{token} -> Access file via shared link (unauthenticated access)

Sync & Change Tracking <br>
- GET /sync/updates -> Streams or poolls for real-time file/folder changes.

All APIs are secured, support idempotency, and follow RESTful principles. Uploads are resumble. Medata is reparate from file content.
