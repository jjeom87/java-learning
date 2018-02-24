package org.sunj.tutorials.kapt;

import java.util.Map;
import org.sunj.tutorials.kapt.constant.KaptStateCd;
import org.sunj.tutorials.kapt.constant.KaptWebServiceTypeCd;

public class KaptWebServiceFactory {
	public KaptWebService generateKaptWebService(KaptWebServiceTypeCd kwsTypeCd, Map<String, Object> info){
		
		String rfqNo = "";
		KaptStateCd kaptStateCd = null; 
		
		KaptWebService kws = null;
		if (KaptWebServiceTypeCd.NOTICE == kwsTypeCd) {
			kws = new NoticeKaptWebService(rfqNo, kaptStateCd);
		} else {
			kws = new ResultKaptWebService(rfqNo, kaptStateCd);
		}
		return kws;
	}
}