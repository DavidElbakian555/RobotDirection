public class Robot {
        private int x;
        private int y;
        private Direction direction;

        public Robot() {
            this.x = 0;
            this.y = 0;
            this.direction = Direction.UP;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            switch (direction) {
                case UP -> direction = Direction.LEFT;
                case DOWN -> direction = Direction.RIGHT;
                case LEFT -> direction = Direction.DOWN;
                case RIGHT -> direction = Direction.UP;
            }
        }

        public void turnRight() {
            switch (direction) {
                case UP -> direction = Direction.RIGHT;
                case DOWN -> direction = Direction.LEFT;
                case LEFT -> direction = Direction.UP;
                case RIGHT -> direction = Direction.DOWN;
            }
        }

        public void stepForward() {
            switch (direction) {
                case UP -> y++;
                case DOWN -> y--;
                case LEFT -> x--;
                case RIGHT -> x++;
            }
        }
}
