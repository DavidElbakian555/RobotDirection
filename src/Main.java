public class Main {
    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }


    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println("Начальная позиция робота: (" + robot.getX() + ", " + robot.getY() + ")");

        moveRobot(robot, 3, 8);
        System.out.println("Конечная позиция робота: (" + robot.getX() + ", " + robot.getY() + ")");

    }
}