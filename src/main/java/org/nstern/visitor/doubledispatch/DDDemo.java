package org.nstern.visitor.doubledispatch;

public class DDDemo
{
    public static void main(String[] args)
    {
        System.out.println("1. Asteroid.collideWith(SpaceShip) and Asteroid.collideWith(ApolloSpacecraft)");
        Asteroid theAsteroid = new Asteroid();
        SpaceShip theSpaceShip = new SpaceShip();
        ApolloSpacecraft theApolloSpacecraft = new ApolloSpacecraft();
        theAsteroid.collideWith(theSpaceShip);
        theAsteroid.collideWith(theApolloSpacecraft);
        System.out.println();

        System.out.println("2. ExplodingAsteroid.collideWith(SpaceShip) and ExplodingAsteroid.collideWith(ApolloSpacecraft)");
        ExplodingAsteroid theExplodingAsteroid = new ExplodingAsteroid();
        theExplodingAsteroid.collideWith(theSpaceShip);
        theExplodingAsteroid.collideWith(theApolloSpacecraft);
        System.out.println();

        System.out.println("3. ExplodingAsteroid.collideWith(SpaceShip) and ExplodingAsteroid.collideWith(ApolloSpacecraft)");
        Asteroid theAsteroidReference = theExplodingAsteroid;
        theAsteroidReference.collideWith(theSpaceShip);
        theAsteroidReference.collideWith(theApolloSpacecraft);
        System.out.println();

        System.out.println("4. Asteroid.collideWith(SpaceShip) and ExplodingAsteroid.collideWith(SpaceShip)");
        SpaceShip theSpaceShipReference = theApolloSpacecraft;
        theAsteroid.collideWith(theSpaceShipReference);
        theAsteroidReference.collideWith(theSpaceShipReference);
        System.out.println();

        System.out.println("5. Asteroid.collideWith(ApolloSpacecraft) and ExplodingAsteroid.collideWith(ApolloSpacecraft)");
        theSpaceShipReference = theApolloSpacecraft;
        theAsteroidReference = theExplodingAsteroid;
        theSpaceShipReference.collideWith(theAsteroid);
        theSpaceShipReference.collideWith(theAsteroidReference);
    }
}

class SpaceShip
{
    void collideWith(Asteroid inAsteroid)
    {
        inAsteroid.collideWith(this);
    }
}

class ApolloSpacecraft extends SpaceShip
{
    void collideWith(Asteroid inAsteroid)
    {
        inAsteroid.collideWith(this);
    }
}

class Asteroid
{
    void collideWith(SpaceShip s)
    {
        System.out.println("Asteroid hit a SpaceShip");
    }

    void collideWith(ApolloSpacecraft as)
    {
        System.out.println("Asteroid hit an ApolloSpacecraft");
    }
}

class ExplodingAsteroid extends Asteroid
{
    void collideWith(SpaceShip s)
    {
        System.out.println("ExplodingAsteroid hit a SpaceShip");
    }

    void collideWith(ApolloSpacecraft as)
    {
        System.out.println("ExplodingAsteroid hit an ApolloSpacecraft");
    }
}
