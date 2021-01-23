package com.board.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BoardDTO {
	
	/* 번호 */
	private Long idx;
	
	/* 제목 */
	private String title;
	
	/* 내용 */
	private String content;
	
	/* 작성자 */
	private String writer;
	
	/* 조회수 */
	private int view_cnt;
	
	/* 공지글 여부 */
	private String noticeYn;

	/* 비밀글 여부 */
	private String secretYn;
	
	/* 삭제 여부 */
	private String deleteYn;
	
	/* 등록일 */
	private LocalDateTime insertTime;
	
	/* 수정일 */
	private LocalDateTime updateTime;
	
	/* 삭제일 */
	private LocalDateTime deleteTime;

	
}
