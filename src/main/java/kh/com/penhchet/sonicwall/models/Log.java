package kh.com.penhchet.sonicwall.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import javax.annotation.Generated;
import java.util.UUID;

@Document(indexName = "sonicwall", type = "logs", shards = 5, replicas = 1)
public class Log {

	@Id
	private String id;
	private String logID;
	private String Time;
	private String category;
	private String group;
	private String event;
	private String msgType;
	private String priority;
	private String etherType;
	private String srcMAC;
	private String srcInt;
	private String srcZone;
	private String dstMAC;
	private String dstInt;
	private String dstZone;
	private String srcIP;
	private String srcPort;
	private String srcName;
	private String srcNATIP;
	private String srcNATPort ;
	private String inSPI;
	private String dstIP;
	private String dstPort;
	private String dstName;
	private String dstNATIP;
	private String dstNATPort;
	private String outSPI;
	private String ipProtocol;
	private String icmpType;
	private String icmpCode;
	private String rxBytes;
	private String txBytes;
	private String accessRule;
	private String natPolicy;
	private String userName;
	private String sessionTime;
	private String sessionType;
	private String idpRule;
	private String idpPriority;
	private String httpPOP;
	private String url;
	private String vpnPolicy;
	private String httpResult;
	private String blockCat;
	private String application;
	private String fwAction;
	private String notes;
	private String message;

	public Log(){
		id = UUID.randomUUID().toString();
	}

	public String getLogID() {
		return logID;
	}

	public void setLogID(String logID) {
		this.logID = logID;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getEtherType() {
		return etherType;
	}

	public void setEtherType(String etherType) {
		this.etherType = etherType;
	}

	public String getSrcMAC() {
		return srcMAC;
	}

	public void setSrcMAC(String srcMAC) {
		this.srcMAC = srcMAC;
	}

	public String getSrcInt() {
		return srcInt;
	}

	public void setSrcInt(String srcInt) {
		this.srcInt = srcInt;
	}

	public String getSrcZone() {
		return srcZone;
	}

	public void setSrcZone(String srcZone) {
		this.srcZone = srcZone;
	}

	public String getDstMAC() {
		return dstMAC;
	}

	public void setDstMAC(String dstMAC) {
		this.dstMAC = dstMAC;
	}

	public String getDstInt() {
		return dstInt;
	}

	public void setDstInt(String dstInt) {
		this.dstInt = dstInt;
	}

	public String getDstZone() {
		return dstZone;
	}

	public void setDstZone(String dstZone) {
		this.dstZone = dstZone;
	}

	public String getSrcIP() {
		return srcIP;
	}

	public void setSrcIP(String srcIP) {
		this.srcIP = srcIP;
	}

	public String getSrcPort() {
		return srcPort;
	}

	public void setSrcPort(String srcPort) {
		this.srcPort = srcPort;
	}

	public String getSrcName() {
		return srcName;
	}

	public void setSrcName(String srcName) {
		this.srcName = srcName;
	}

	public String getSrcNATIP() {
		return srcNATIP;
	}

	public void setSrcNATIP(String srcNATIP) {
		this.srcNATIP = srcNATIP;
	}

	public String getSrcNATPort() {
		return srcNATPort;
	}

	public void setSrcNATPort(String srcNATPort) {
		this.srcNATPort = srcNATPort;
	}

	public String getInSPI() {
		return inSPI;
	}

	public void setInSPI(String inSPI) {
		this.inSPI = inSPI;
	}

	public String getDstIP() {
		return dstIP;
	}

	public void setDstIP(String dstIP) {
		this.dstIP = dstIP;
	}

	public String getDstPort() {
		return dstPort;
	}

	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
	}

	public String getDstName() {
		return dstName;
	}

	public void setDstName(String dstName) {
		this.dstName = dstName;
	}

	public String getDstNATIP() {
		return dstNATIP;
	}

	public void setDstNATIP(String dstNATIP) {
		this.dstNATIP = dstNATIP;
	}

	public String getDstNATPort() {
		return dstNATPort;
	}

	public void setDstNATPort(String dstNATPort) {
		this.dstNATPort = dstNATPort;
	}

	public String getOutSPI() {
		return outSPI;
	}

	public void setOutSPI(String outSPI) {
		this.outSPI = outSPI;
	}

	public String getIpProtocol() {
		return ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
	}

	public String getIcmpType() {
		return icmpType;
	}

	public void setIcmpType(String icmpType) {
		this.icmpType = icmpType;
	}

	public String getIcmpCode() {
		return icmpCode;
	}

	public void setIcmpCode(String icmpCode) {
		this.icmpCode = icmpCode;
	}

	public String getRxBytes() {
		return rxBytes;
	}

	public void setRxBytes(String rxBytes) {
		this.rxBytes = rxBytes;
	}

	public String getTxBytes() {
		return txBytes;
	}

	public void setTxBytes(String txBytes) {
		this.txBytes = txBytes;
	}

	public String getAccessRule() {
		return accessRule;
	}

	public void setAccessRule(String accessRule) {
		this.accessRule = accessRule;
	}

	public String getNatPolicy() {
		return natPolicy;
	}

	public void setNatPolicy(String natPolicy) {
		this.natPolicy = natPolicy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public String getIdpRule() {
		return idpRule;
	}

	public void setIdpRule(String idpRule) {
		this.idpRule = idpRule;
	}

	public String getIdpPriority() {
		return idpPriority;
	}

	public void setIdpPriority(String idpPriority) {
		this.idpPriority = idpPriority;
	}

	public String getHttpPOP() {
		return httpPOP;
	}

	public void setHttpPOP(String httpPOP) {
		this.httpPOP = httpPOP;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVpnPolicy() {
		return vpnPolicy;
	}

	public void setVpnPolicy(String vpnPolicy) {
		this.vpnPolicy = vpnPolicy;
	}

	public String getHttpResult() {
		return httpResult;
	}

	public void setHttpResult(String httpResult) {
		this.httpResult = httpResult;
	}

	public String getBlockCat() {
		return blockCat;
	}

	public void setBlockCat(String blockCat) {
		this.blockCat = blockCat;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getFwAction() {
		return fwAction;
	}

	public void setFwAction(String fwAction) {
		this.fwAction = fwAction;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Log{" +
				"logID='" + logID + '\'' +
				", Time='" + Time + '\'' +
				", id='" + id + '\'' +
				", category='" + category + '\'' +
				", group='" + group + '\'' +
				", event='" + event + '\'' +
				", msgType='" + msgType + '\'' +
				", priority='" + priority + '\'' +
				", etherType='" + etherType + '\'' +
				", srcMAC='" + srcMAC + '\'' +
				", srcInt='" + srcInt + '\'' +
				", srcZone='" + srcZone + '\'' +
				", dstMAC='" + dstMAC + '\'' +
				", dstInt='" + dstInt + '\'' +
				", dstZone='" + dstZone + '\'' +
				", srcIP='" + srcIP + '\'' +
				", srcPort='" + srcPort + '\'' +
				", srcName='" + srcName + '\'' +
				", srcNATIP='" + srcNATIP + '\'' +
				", srcNATPort='" + srcNATPort + '\'' +
				", inSPI='" + inSPI + '\'' +
				", dstIP='" + dstIP + '\'' +
				", dstPort='" + dstPort + '\'' +
				", dstName='" + dstName + '\'' +
				", dstNATIP='" + dstNATIP + '\'' +
				", dstNATPort='" + dstNATPort + '\'' +
				", outSPI='" + outSPI + '\'' +
				", ipProtocol='" + ipProtocol + '\'' +
				", icmpType='" + icmpType + '\'' +
				", icmpCode='" + icmpCode + '\'' +
				", rxBytes='" + rxBytes + '\'' +
				", txBytes='" + txBytes + '\'' +
				", accessRule='" + accessRule + '\'' +
				", natPolicy='" + natPolicy + '\'' +
				", userName='" + userName + '\'' +
				", sessionTime='" + sessionTime + '\'' +
				", sessionType='" + sessionType + '\'' +
				", idpRule='" + idpRule + '\'' +
				", idpPriority='" + idpPriority + '\'' +
				", httpPOP='" + httpPOP + '\'' +
				", url='" + url + '\'' +
				", vpnPolicy='" + vpnPolicy + '\'' +
				", httpResult='" + httpResult + '\'' +
				", blockCat='" + blockCat + '\'' +
				", application='" + application + '\'' +
				", fwAction='" + fwAction + '\'' +
				", notes='" + notes + '\'' +
				", message='" + message + '\'' +
				'}';
	}
}