public class Main {

    public static void main(String[] args) {
        Numeral a = new Numeral(10);
        Numeral b = new Numeral(20);

        Expression expression = new Addition(a, new Square(b)) {
            @Override
            public Expression left() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Expression right() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        System.out.println(expression.toString()); // (10 + (20)^2)
        System.out.println(expression.evaluate()); // 520
    }
}