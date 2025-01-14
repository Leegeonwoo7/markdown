**PostgreSQL**
```
CREATE TABLE public.requirement (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    file BYTEA
);
```

**MYSQL**
```
CREATE TABLE requirement (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    file LONGBLOB
);
```
