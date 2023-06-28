package kotddari.board.entity;

import kotddari.board.dto.BoardDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

// DB의 테이블 역할을 하는 클래스
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false) // 크기 20, NOT NULL
    private String boardWriter;

    @Column(length = 50, nullable = false)
    private String boardPassword;

    @Column(nullable = false) // 기본값: 크기 255
    private String boardTitle;

    @Column(length = 500, nullable = false)
    private String boardContent;

    @Column(nullable = false)
    private int boardHits;

    public BoardEntity(int id, String boardWriter, String boardPassword, String boardTitle, String boardContent, int boardHits) {
        this.id = id;
        this.boardWriter = boardWriter;
        this.boardPassword = boardPassword;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardHits = boardHits;
    }

    public static BoardEntity toBoardEntity(BoardDTO boardDTO) {
        return new BoardEntity(boardDTO.getId(), boardDTO.getBoardWriter(),
                boardDTO.getBoardPassword(), boardDTO.getBoardTitle(),
                boardDTO.getBoardContent(), boardDTO.getBoardHits());
    }

}
