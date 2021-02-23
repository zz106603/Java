package ch07.exam04;

public class HomeActivity extends Activity{
	
	
	public HomeActivity() {
		super();
	}
	
	@Override
	public void onCreate() {
		super.onCreate(); //부모를 참조하는 변수
		System.out.println("자식이 UI 요소를 생성합니다.");
		System.out.println("자식이 UI 요소에 이벤트를 처리합니다.");
	}

}
