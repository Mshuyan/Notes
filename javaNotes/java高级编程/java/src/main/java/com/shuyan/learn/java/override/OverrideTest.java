package com.shuyan.learn.java.override;

/**
 * @author will
 */
public class OverrideTest extends Test{

}

class Test{
     Object test1(Long id){
        return 0L;
    }
}

class OverrideTest1 extends OverrideTest{
    @Override
    Object test1(Long id) {
        return super.test1(id);
    }
}
