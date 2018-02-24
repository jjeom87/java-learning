package org.sunj.tutorials.kapt;

import org.sunj.tutorials.kapt.constant.KaptStateCd;


public class NoticeKaptWebService implements KaptWebService {

	private String rfqNo;
	private KaptStateCd kaptStateCd;
	
	public NoticeKaptWebService() {}
	
	public NoticeKaptWebService(String rfqNo, KaptStateCd kaptStateCd) {
		this.rfqNo = rfqNo;
		this.kaptStateCd = kaptStateCd;
	}
	
	@Override
	public void send() throws Exception {
		// TODO Auto-generated method stub

	}

}