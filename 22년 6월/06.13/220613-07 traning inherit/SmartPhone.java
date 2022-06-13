public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private String memorySize;
	private String cameraMount;
	private String bluetooth;
	
	public SmartPhone(String company, int price, String type, String osType, String osVersion, String memorySize,
			String cameraMount, String bluetooth) {
		super(company, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memorySize = memorySize;
		this.cameraMount = cameraMount;
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return super.toString() + ", 운영체제 타입: " + osType + ", 운영체제 버전: " + osVersion + ", 내부 메모리 크기: " + memorySize
				+ ", 카메라 장착여부: " + cameraMount + ", 블루투스 지원 여부: " + bluetooth;
	}
}
