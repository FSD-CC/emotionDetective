package www.ehaoyao.fsd.bean;

import java.util.Date;

/**
 * γ��ʵ����
 * @author Administrator
 *
 */
public class AtitudeBean {

	private int atitudeId;
	private String qname;//����
	private String atitudeType;//��������� :������  ��ͼƬ�������ʾ����Ƕ���  ������Ǳˮ����ɮ ����ͨ
	private int qcount;//����
	private int qq;//
	private String qtime;//ʱ��
	private String content;//����
	
	public int getAtitudeId() {
		return atitudeId;
	}
	public void setAtitudeId(int atitudeId) {
		this.atitudeId = atitudeId;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getAtitudeType() {
		return atitudeType;
	}
	public void setAtitudeType(String atitudeType) {
		this.atitudeType = atitudeType;
	}
	public int getQcount() {
		return qcount;
	}
	public void setQcount(int qcount) {
		this.qcount = qcount;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	public String getQtime() {
		return qtime;
	}
	public void setQtime(String qtime) {
		this.qtime = qtime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
