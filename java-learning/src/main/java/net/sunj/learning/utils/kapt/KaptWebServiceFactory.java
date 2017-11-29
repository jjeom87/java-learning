package net.sunj.learning.utils.kapt;

import java.util.Map;

import net.sunj.learning.utils.kapt.constant.KaptStateCd;
import net.sunj.learning.utils.kapt.constant.KaptWebServiceTypeCd;

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