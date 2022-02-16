escape room game. mechanics similar to those old flash games like riddle school

TODO LIST OF THINGS I NEED TO DO NEXT:
- get working map
- get system for placing entities on map 
    - add Entity class?
- make working inspect()
    - need:
        - "dictionary" of entities (Entity is a class, store Entity[] in Environment
            - entity id
            - coords (room as map[][], i, j)
            - char What the thing it looks like
            - function to call when inspected
                - eval coords at facing when inspect called
                - if there is entity in dictionary at the coords,
                - do a thing (model off of Item.tryUseItem() system

REMEMBER TO DO THESE
- refactor PrintQueue to work with screensize


https://medium.com/backwoods/flaws-of-an-undead-genre-whats-wrong-with-point-click-adventures-b3cb93a4c364

notes:
entities can use keys

game needs {
    entities
        classes? inheritance from Entity (coords)
        doors can be opened or closed or locked
        can change skin (open and closed doors look diff, can pick up item to replace tile with ground tile)
    player
        movement (4 directions)
        $ inspect (store facing)
        $ use [item]
    printqueue
        queue movement commands but remove from q if others get q'd
            eg just move: "you moved right" but if bump into wall "you bumped into a wall" w/o mvt string
            implementation wip:
                queue all the things
                if queue.size > 1: // if it isnt just movement string
                    queue[0].remove;
        q bumps into entities and walls
        q inspects
        q

    while true
        update():
            userInput = input()
            if (userInput.equals(w,a,s,d)) corresponding mvt command()
            if (userInput.equals(inspect)) inspect()
            if (userInput[0:7].equals(use)) use(userInput[8:])

        render():
            if printqueue empty
                throw bug // dont crash game // should never be empty
            while stuff in printqueue
                printToGame(stuff)
                wait for player hit RET

}


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
