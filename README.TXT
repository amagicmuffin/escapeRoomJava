escape room game. mechanics similar to those old flash games like riddle school

https://medium.com/backwoods/flaws-of-an-undead-genre-whats-wrong-with-point-click-adventures-b3cb93a4c364

notes:
entities can use keys


eg door w/o key cannot open. door w/ key can open.
{
    // TODO: where would this go?
    // pseudocode
    interact(coords);

    def interact(coords):
        switch coords:
            case coords == coordsOfDoor1:
                tryOpenDoor1();
            case coords == coordsOfDoor2:
                tryOpenDoor2();
            finally: return false;

    def tryOpenDoor1():
        if(haveKey):
            openDoor();
        else:
            printToGame("you dont have key");

}