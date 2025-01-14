**PostgreSQL**
                                    Table "public.requirement"
 Column |          Type          | Collation | Nullable |                 Default
--------+------------------------+-----------+----------+-----------------------------------------
 id     | integer                |           | not null | nextval('requirement_id_seq'::regclass)
 title  | character varying(255) |           |          |
 file   | bytea                  |           |          |
Indexes:
    "requirement_pkey" PRIMARY KEY, btree (id)

**MYSQL**
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | bigint       | NO   | PRI | NULL    | auto_increment |
| title | varchar(100) | YES  |     | NULL    |                |
| file  | longblob     | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
