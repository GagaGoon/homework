package module2;

public class Ex3 {
    public static void main(String[] args) {
        Robot robot = new Robot(5, 200, Direction.LEFT);
        Ex3.moveRobot(robot, 20, 20);
        System.out.println(robot.getDirection() + " " + robot.getX() + " " + robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY){
        switch(robot.getDirection()){
            case UP:
                if(robot.getX()-toX>0){
                    robot.turnLeft();
                }
                else{
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if(robot.getX()-toX>0){
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if(robot.getX()-toX>0){
                    robot.turnRight();
                }
                else{
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if(robot.getX()-toX<0){
                    robot.turnLeft();
                    robot.turnLeft();
                }
        }

        while(robot.getX()!=toX){
            robot.stepForward();
        }

        switch(robot.getDirection()){
            case UP:
                if(robot.getY()-toY>0){
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if(robot.getY()-toY>0){
                    robot.turnRight();
                }
                else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if(robot.getY()-toY<0){
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if(robot.getY()-toY>0){
                    robot.turnLeft();
                }
                else {
                    robot.turnRight();
                }
                break;
        }

        while(robot.getY()!=toY){
            robot.stepForward();
        }
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

class Robot {
    int x=0;
    int y=0;
    Direction direction = Direction.UP;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
        if (direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
            return;
        } else if (direction == Direction.UP){
            this.direction = Direction.LEFT;
            return;
        } else if (direction == Direction.LEFT){
            this.direction = Direction.DOWN;
            return;
        } else if (direction == Direction.RIGHT){
            this.direction = Direction.UP;
            return;
        }
    }
    public void turnRight() {
        if (this.direction == Direction.DOWN){
            this.direction = Direction.LEFT;
            return;
        } else if (this.direction == Direction.UP){
            this.direction = Direction.RIGHT;
            return;
        }else if (this.direction == Direction.LEFT){
            this.direction = Direction.UP;
            return;
        } else if (this.direction == Direction.RIGHT){
            this.direction = Direction.DOWN;
            return;
        }
    }
    public void stepForward() {
        if (direction == Direction.DOWN){
            this.y--;
        } else if (direction == Direction.UP){
            this.y++;
        } else if (direction == Direction.LEFT){
            this.x--;
        } else if (direction == Direction.RIGHT){
            this.x++;
        }
    }
}