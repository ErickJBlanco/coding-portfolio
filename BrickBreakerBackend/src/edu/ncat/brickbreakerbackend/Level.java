    package edu.ncat.brickbreakerbackend;
    /*
    Student Name: Erick Blanco
    o Date: 09/26/2024
    o Class / Section: Comp 167- 003
    o This class will hold the designs for how a level looks.
     */
    public class Level {
        //declaring private variables for the Level class;
        private int levelNum; //
        private BrickRow [] brickRows; // declares the array

        //No-arg constructor
        public Level() {
            this.levelNum = 0; //Level 0 is default
            this.brickRows = new BrickRow[10];//initialized empty BrickRow array
        }
        //Constructor with parameters;
        public Level(int levelNum, int numBrickRows) {
            setLevelNum(levelNum);
            this.brickRows = new BrickRow[numBrickRows]; //instantiate an array with the num of brick Rows
            for (int i = 0; i < numBrickRows; i++) {
                this.brickRows[i] = new BrickRow();  // Initialize each BrickRow element
            }
        }

        public BrickRow getBrickRow(int index) {
                return brickRows[index];

        }

        public void setBrickRow(int index, BrickRow brickRow) {
            brickRows[index] = brickRow;
        }

        public String toString() {

            String result =  levelNum + "\n" + getNumBrickRows() + "\n";
            for (int i = 0; i < brickRows.length; i++) {

                System.out.println(brickRows[i].toString());

                result += i; //appends the brickrow elements to result
            }
            return result;
        }
        //getters and setters for the level number
        public int getLevelNum() {
            return levelNum;
        }

        public void setLevelNum(int levelNum) {
            this.levelNum = levelNum;
        }

        public int getBricksPerRow() {
            return brickRows[0].getBrickMaskLength();
        }

        public int getNumBrickRows() {
            return brickRows.length;
        }

    }
