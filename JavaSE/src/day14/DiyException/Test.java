package day14.DiyException;

public class Test {
    public static void main(String[] args) {
        // 需求：保存一个合法的年
        try {
            saveAge(225);
            System.out.println("saveAge底层执行是成功的！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("saveAge底层执行是出现bug的！");
        }
    }

    //2、在方法中对age进行判断，不合法则抛出AgeIllegalException
    public static void saveAge(int age) throws AgeIllegalException {
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存： " + age);
        }else {
            // 用一个异常对象封装这个问题
            // throw 抛出去这个异常对象
            throw new AgeIllegalException("/age is illegal, your age is " + age);
        }
    }
}
