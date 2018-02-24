package org.sunj.tutorials.kapt.constant;

public enum KaptStateCd {
	// 입찰진행상황 (1신규, 2수정, 3재, 4유찰, 5낙찰:계약완료, 6취소, 7수정취소,8:낙찰:계약진행,9:계약취소)
	INSERT("1"), UPDATE("2"), REBID("3"), NONBID("4"), COMPLETEPO("5"), CANCLE("6"), UPDATECANCLE("7"), PROGRESSPO("8"), CANCLEPO("9");
	
	private String codeNo;
	
	private KaptStateCd(String codeNo){
		this.codeNo = codeNo;
	}
	
	public String getCodeNo() {
		return codeNo;
	}

}