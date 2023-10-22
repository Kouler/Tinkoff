package edu.hm2.task1;

public record Negate(Expr obj) implements Expr {
    @Override
    public double evaluate() {
        return -obj.evaluate();
    }
}
