DROP TABLE IF EXISTS board_table;

CREATE TABLE board_table (
    board_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '게시물 ID 번호',
    board_writer VARCHAR(30) NOT NULL COMMENT '게시물 작성자',
    board_password VARCHAR(50) NOT NULL COMMENT '게시물 암호',
    board_title VARCHAR(200) NOT NULL COMMENT '게시물 제목',
    board_content VARCHAR(1000) NOT NULL COMMENT '게시물 내용',
    board_hits INT NOT NULL COMMENT '게시물 조회수',
    created_time DATE COMMENT '게시물 생성 일시',
    updated_time DATE COMMENT '게시물 수정 일시'
) COMMENT '게시물'
