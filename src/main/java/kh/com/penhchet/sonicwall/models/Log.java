package kh.com.penhchet.sonicwall.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "sonicwall", type = "logs")
public class Log {
	@Id
	private String Time;
	private String ID;
	private String Category;
	private String Group;
	private String Event;
	private String MsgType;
	private String Priority;
	private String EtherType;
	private String SrcMAC;
	private String SrcInt;
	private String SrcZone;
	private String DstMAC;
	private String DstInt;
	private String DstZone;
	private String SrcIP;
	private String SrcPort;
	private String SrcName;
	private String SrcNATIP;
	private String SrcNATPort;
	private String InSPI;
	private String DstIP;
	private String DstPort;
	private String DstName;
	private String DstNATIP;
	private String DstNATPort;
	private String OutSPI;
	private String IPProtocol;
	private String ICMPType;
	private String ICMPCode;
	private String RXBytes;
	private String TXBytes;
	private String AccessRule;
	private String NATPolicy;
	private String UserName;
	private String SessionTime;
	private String SessionType;
	private String IDPRule;
	private String IDPPriority;
	private String HTTPOP;
	private String URL;
	private String VPNPolicy;
	private String HTTPResult;
	private String BlockCat;
	private String Application;
	private String FWAction;
	private String Notes;
	private String Message;
	
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getEtherType() {
		return EtherType;
	}
	public void setEtherType(String etherType) {
		EtherType = etherType;
	}
	public String getSrcMAC() {
		return SrcMAC;
	}
	public void setSrcMAC(String srcMAC) {
		SrcMAC = srcMAC;
	}
	public String getSrcInt() {
		return SrcInt;
	}
	public void setSrcInt(String srcInt) {
		SrcInt = srcInt;
	}
	public String getSrcZone() {
		return SrcZone;
	}
	public void setSrcZone(String srcZone) {
		SrcZone = srcZone;
	}
	public String getDstMAC() {
		return DstMAC;
	}
	public void setDstMAC(String dstMAC) {
		DstMAC = dstMAC;
	}
	public String getDstInt() {
		return DstInt;
	}
	public void setDstInt(String dstInt) {
		DstInt = dstInt;
	}
	public String getDstZone() {
		return DstZone;
	}
	public void setDstZone(String dstZone) {
		DstZone = dstZone;
	}
	public String getSrcIP() {
		return SrcIP;
	}
	public void setSrcIP(String srcIP) {
		SrcIP = srcIP;
	}
	public String getSrcPort() {
		return SrcPort;
	}
	public void setSrcPort(String srcPort) {
		SrcPort = srcPort;
	}
	public String getSrcName() {
		return SrcName;
	}
	public void setSrcName(String srcName) {
		SrcName = srcName;
	}
	public String getSrcNATIP() {
		return SrcNATIP;
	}
	public void setSrcNATIP(String srcNATIP) {
		SrcNATIP = srcNATIP;
	}
	public String getSrcNATPort() {
		return SrcNATPort;
	}
	public void setSrcNATPort(String srcNATPort) {
		SrcNATPort = srcNATPort;
	}
	public String getInSPI() {
		return InSPI;
	}
	public void setInSPI(String inSPI) {
		InSPI = inSPI;
	}
	public String getDstIP() {
		return DstIP;
	}
	public void setDstIP(String dstIP) {
		DstIP = dstIP;
	}
	public String getDstPort() {
		return DstPort;
	}
	public void setDstPort(String dstPort) {
		DstPort = dstPort;
	}
	public String getDstName() {
		return DstName;
	}
	public void setDstName(String dstName) {
		DstName = dstName;
	}
	public String getDstNATIP() {
		return DstNATIP;
	}
	public void setDstNATIP(String dstNATIP) {
		DstNATIP = dstNATIP;
	}
	public String getDstNATPort() {
		return DstNATPort;
	}
	public void setDstNATPort(String dstNATPort) {
		DstNATPort = dstNATPort;
	}
	public String getOutSPI() {
		return OutSPI;
	}
	public void setOutSPI(String outSPI) {
		OutSPI = outSPI;
	}
	public String getIPProtocol() {
		return IPProtocol;
	}
	public void setIPProtocol(String iPProtocol) {
		IPProtocol = iPProtocol;
	}
	public String getICMPType() {
		return ICMPType;
	}
	public void setICMPType(String iCMPType) {
		ICMPType = iCMPType;
	}
	public String getICMPCode() {
		return ICMPCode;
	}
	public void setICMPCode(String iCMPCode) {
		ICMPCode = iCMPCode;
	}
	public String getRXBytes() {
		return RXBytes;
	}
	public void setRXBytes(String rXBytes) {
		RXBytes = rXBytes;
	}
	public String getTXBytes() {
		return TXBytes;
	}
	public void setTXBytes(String tXBytes) {
		TXBytes = tXBytes;
	}
	public String getAccessRule() {
		return AccessRule;
	}
	public void setAccessRule(String accessRule) {
		AccessRule = accessRule;
	}
	public String getNATPolicy() {
		return NATPolicy;
	}
	public void setNATPolicy(String nATPolicy) {
		NATPolicy = nATPolicy;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getSessionTime() {
		return SessionTime;
	}
	public void setSessionTime(String sessionTime) {
		SessionTime = sessionTime;
	}
	public String getSessionType() {
		return SessionType;
	}
	public void setSessionType(String sessionType) {
		SessionType = sessionType;
	}
	public String getIDPRule() {
		return IDPRule;
	}
	public void setIDPRule(String iDPRule) {
		IDPRule = iDPRule;
	}
	public String getIDPPriority() {
		return IDPPriority;
	}
	public void setIDPPriority(String iDPPriority) {
		IDPPriority = iDPPriority;
	}
	public String getHTTPOP() {
		return HTTPOP;
	}
	public void setHTTPOP(String hTTPOP) {
		HTTPOP = hTTPOP;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getVPNPolicy() {
		return VPNPolicy;
	}
	public void setVPNPolicy(String vPNPolicy) {
		VPNPolicy = vPNPolicy;
	}
	public String getHTTPResult() {
		return HTTPResult;
	}
	public void setHTTPResult(String hTTPResult) {
		HTTPResult = hTTPResult;
	}
	public String getBlockCat() {
		return BlockCat;
	}
	public void setBlockCat(String blockCat) {
		BlockCat = blockCat;
	}
	public String getApplication() {
		return Application;
	}
	public void setApplication(String application) {
		Application = application;
	}
	public String getFWAction() {
		return FWAction;
	}
	public void setFWAction(String fWAction) {
		FWAction = fWAction;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "Log [Time=" + Time + ", ID=" + ID + ", Category=" + Category + ", Group=" + Group + ", Event=" + Event
				+ ", MsgType=" + MsgType + ", Priority=" + Priority + ", EtherType=" + EtherType + ", SrcMAC=" + SrcMAC
				+ ", SrcInt=" + SrcInt + ", SrcZone=" + SrcZone + ", DstMAC=" + DstMAC + ", DstInt=" + DstInt
				+ ", DstZone=" + DstZone + ", SrcIP=" + SrcIP + ", SrcPort=" + SrcPort + ", SrcName=" + SrcName
				+ ", SrcNATIP=" + SrcNATIP + ", SrcNATPort=" + SrcNATPort + ", InSPI=" + InSPI + ", DstIP=" + DstIP
				+ ", DstPort=" + DstPort + ", DstName=" + DstName + ", DstNATIP=" + DstNATIP + ", DstNATPort="
				+ DstNATPort + ", OutSPI=" + OutSPI + ", IPProtocol=" + IPProtocol + ", ICMPType=" + ICMPType
				+ ", ICMPCode=" + ICMPCode + ", RXBytes=" + RXBytes + ", TXBytes=" + TXBytes + ", AccessRule="
				+ AccessRule + ", NATPolicy=" + NATPolicy + ", UserName=" + UserName + ", SessionTime=" + SessionTime
				+ ", SessionType=" + SessionType + ", IDPRule=" + IDPRule + ", IDPPriority=" + IDPPriority + ", HTTPOP="
				+ HTTPOP + ", URL=" + URL + ", VPNPolicy=" + VPNPolicy + ", HTTPResult=" + HTTPResult + ", BlockCat="
				+ BlockCat + ", Application=" + Application + ", FWAction=" + FWAction + ", Notes=" + Notes
				+ ", Message=" + Message + "]";
	}
	
}
