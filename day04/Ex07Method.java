package day04;

public class Ex07Method {
    /*
     * 메소드
     * 메소드란, 자바에서 해당 클래스가 가지고 있는 기능
     * 어떤 특정한 작업을 반복적으로 다른데서도 하게 되면
     * 그 코드를 처음부터 끝까지 다시 써주는 것은
     * 비효율적이고 귀찮은 노동이 된다.
     * 
     * 그래서 특정 기능을 다시 사용해야한다면,즉 그 코드들을 다시 사용해야한다면
     * 기능으로 분리해서 메소드로 만들면,그 메소드를 호출만 해주면
     * 해당 코드들이 불러와지기 때문에 다시 안써줘도 된다.
     * 
     * 메소드는 선언과 구현으로 이루어져있다.
     * 선언:해당 메소드의 이름,그리고 실행할때 필요로 하는 외부의 값,
     * 그리고 이 메소드가 종료되면서 호출됬던 곳으로 보내줄
     * 데이터의 타입을 적어주게 된다.
     * 
     * 구현:해당 메소드의 기능을 우리가 직접 코드로 적어주게 된다.
     * 
     * 메소드의 선언과 구현
     * 
     * 리턴타입 메소드이름(파라미터){
     * 메소드의 기능구현
     * }
     * 
     * 리턴타입: 해당 메소드가 종료되면서 
     *        호출한 곳으로 보내줄 데이터타입
     *        만약 아무런 데이터도 보내주지 않을 경우
     *        리턴 타입은 보이드가 된다.
     *        그 외의 경우에는 기능구현 안에 반드시
     *        리턴이라는 명령어를 통해서 해당 데이터타입과
     *        일치하는 데이터타입을 가진 무언가를 돌려보내주어야한다
     *        리턴은 어디에 있든
     * 
     * 메소드 이름: 소문자로 시작하는 동사
     *          낙타등 표기법을 따른다.
     * 
     * 파라미터: 이 메소드를 실행하는데 필요로 하는 외부의 값
     *        만약 해당 메소드를 실행하는데 필요로 하는 외부의 값이
     *        여러개면 여러개의 파라미터가 들어간다.
     *        파라미터의 경우 우리가 변수를 선언하듯
     *        데이터타입 이름
     *        으로 하나씩 적어주면 된다.
     *        또한 파라미터는 해당 메소드 내부에선 변수처럼 취급되기 때문에
     *        매개변수 라고도 부른다.
     *        또한 파라미터는 해당 메소드 전체가 유효범위가 된다.
     *        그리고 외부에서 해당 메소드를 호출할 때에 값을 넘겨주어야 하는데
     *        이때는 파라미터와 이름이 일치할 필요는 없지만
     *        해당 파라미터의 데이터타입과 순서가 일치해야한다.
     *        
     * 메소드 오버로딩(overloading)
     * 메소드 오버로딩이란, 이름은 같지만 파라미터가 달라져서 같은 목적을 가진
     * 여러개의 메소드를 같은 이름으로 묶는 방법을 말한다.
     * 
     * Q) 다음중 파라미터가 다른 메소드 하나는?
     * 1. void printInfo(String name)
     * 2. void printInfo(String school)
     * 3. void printInfo(String jumin)
     * 4. void printInfo(int age)
     * 
     * 파라미터가 다르다는 것은
     * 해당 메소드의 파라미터 안의 데이터타입의 순서가 다르다 라는 뜻이 된다.
     * 즉 파라미터가 다른지 같은지가 궁금하면, 이름은 무시하고
     * 파타미터의 데이터타입을 써보면 같은지 다른지 알수있다
     * 
     * 접근제한자(Access Modifier)
     * 접근제한자란 해당 메소드 혹은 필드가 외부 클래스가
     * 사용가능하지를 지정하는 키워드이다.
     * public,protected,default,private 키워드가 있으며
     * 각각 다음과 같은 범위에서 사용가능하다
     * public: 해당 메소드 혹은 필드를 어디서든 접근 가능
     * protected: 해당 메소드 혹은 필드를 같은 패키지의 다른 클래스들은
     *           자유롭게 접근가능하지만 다른 패키지일 경우에는
     *           해당 클래스를 상속받는 클래스만 접근가능하다.
     * default: 해당 메소드 혹은 필드는 같은 패키지의 다른 클래스들은
     *         자유롭게 접근 가능하지만 다른 패키지일 경우에는 모든 접근이 불가
     *         default키워드는 기본적으로 스위치에서 사용되기 때문에
     *         아무런 접근제한자도 안 적어주면 기본적으로 default가 적용된다
     *         또한, 같은 패키지에서만 접근가능하기 때문에 package라고도 부른다
     * private: 해당 메소드 혹은 필드는 모든 외부 클래스가 접근 불가능
     *         오직 해당 클래스 내부에서만 호출 가능하다.
     */

}
