package item24;

public class MemberClass {
    private final int testInteger=1;

    class NestedClass{
        void doSomething(){
            System.out.println(MemberClass.this.testInteger);
        }
    }

    // 익명 클래스, 선언한 지점에서만 인스턴스를 만들 수 있고, instanceof 검사나 이름이 필요한 작업은 수행 불가.
    void doAnonymous(){
        new AnonymousInterface(){
            @Override
            public void doSomething() {
                System.out.println(testInteger);
            }
        };
    }

    // 지역 클래스, 멤버클래스 처럼 이름이 있고 반복해서 사용 가능. 정적 멤버는 가질 수 없고 짧게 우지해야함.
    void doLocal(){
        class LocalClass{
            void doSomething(){
                System.out.println(testInteger);
            }
        }
    }


    public static void main(String[] args){
        NestedClass nestedClass = new MemberClass().new NestedClass();
        nestedClass.doSomething();
    }
}
