难易程度：★★★

重要性：★★★★


在网易游戏的面试中出现过：要求不使用第三个数交换两个数的值

一个专注应届生互联网求职分享的公众号“菜鸟名企梦”

//不使用第三个数交换两个数的值
private void swap1() {
        int a=10,b=12;

        a=b-a; //a=2;b=12
        b=b-a; //a=2;b=10
        a=b+a; //a=12;b=10
    }
    private void swap2() {
        int a=10,b=12;

        a=a+b;//a=22,b=12
        b=a-b;//a=22,b=10
        a=a-b;//a=12,b=10
    }
