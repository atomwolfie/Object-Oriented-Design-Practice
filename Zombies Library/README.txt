1. I first was thinking about extending my GUI I made for creating shapes but had no creative ideas.
I then looked at the shape library and tried to think what I wanted to do with it.
I felt limited when thinking about the concept of shapes, but that what if I changed the concept to something
else and made some kind of game.

2. I decided to instead of working with shapes I would make a game about zombies.
This allowed a type of freedom for my mind to roam on how I would want to make a game,
thus opening my options for implementing different patterns we have learned about in the class.

3. Instead of rewriting the shape classes I figured I might as well start from scratch.
Using the OO principles we've learned in class I was able to fairly quickly create a zombies
library of different types of zombies with a simple factory for creating them.

4. The idea of the game is round based. In that you begin at round one with a minimal amount of zombies,
but with increasing rounds the number of zombies would increase making it harder and harder. Where this idea gets interesting
is that the rounds are not based on a simple function of increasing zombies. I wanted different types of rounds,
rounds that consist of only basic zombies, rounds that consist of only 1 type of zombie, or rounds that are mixed.
This type of round creation needed a factory, but it needed something else to help me actually create different types of rounds

5. That is finally where the Template Method comes into play. Using the template method I was able to create different
types of rounds that consist of different types of zombies to the way the game plays round to round is different.
I use a random number generator to tell a round factory to used the round template in round creation.

6. Thus I have a Zombie Game library that could be extended to be used in a text based game, gui game, or anything else.

Note: Since this is a class library I did not see a reason to make an activity ddiagram or interaction diagram. That would depend how the library is integrated.
