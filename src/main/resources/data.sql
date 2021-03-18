INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');

INSERT INTO users (email, username, full_name, password, enabled) VALUES ('admin@sbapp.com', 'admin', 'Administrator' , '$2a$10$5HdjQWrKHUBy8NuTrbDSAe0KYGWGpDQZNFO6LIJ3jBRhgCIMVlsLW', '1');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 4);