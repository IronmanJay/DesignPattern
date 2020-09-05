package DesignPattern.Interpreter;

import java.util.HashMap;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相加
    // var仍然是{a=10,b=20}...
    // 需要debug源码
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var)：返回left表达式对应的值，a = 10
        // super.right.interpreter(var):返回right表达式对应的值，b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
