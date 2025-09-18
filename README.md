# Lab 11
## Part 1: Music Playlist

1. Create a Java program to represent my music library. My playlists are stored in `playlist.txt` contain all the songs I own. Design the program with **multiple classes** used to organize your information. 
2. Create a console program view and interact with my playlists. I want to be able to list all my playlists, list the song in a given playlist, search my songs by artist name and by release year. Extra credit: add the ability to add and remove songs from each playlist. 
3. It doesn't have to be exact, but your program should be something like this:
```
________________________________________________________________
Playlist Viewer Menu
(A) View List of Playlists
(B) View a Playlist
(C) Search Songs
(D) Modify a Playlist

Select a mode: A

Your Playlists:
- Playlist 1: Chill Vibes
- Playlist 2: Classic Rock
- Playlist 3: Pop Hits
  ...
- Playlist 10: Jazz & Soul

________________________________________________________________
Playlist Viewer Menu
(A) View List of Playlists
(B) View a Playlist
(C) Search Songs
(D) Modify a Playlist

Select a mode: B

Which playlist would you like to view: 2

Playlist 2: Classic Rock
1. Hotel California, Eagles, 1976
2. Bohemian Rhapsody, Queen, 1975
3. Stairway to Heaven, Led Zeppelin, 1971
4. Dream On, Aerosmith, 1973
5. Born to Run, Bruce Springsteen, 1975

________________________________________________________________
Playlist Viewer Menu
(A) View List of Playlists
(B) View a Playlist
(C) Search Songs
(D) Modify a Playlist

Select a mode: C

What would you like to search by?
(A) Artist
(B) Year

Select a mode: B

What year would you like to search: 2006

Songs from 2006
Gravity, John Mayer, 2006
```


`playlist.txt`
```
Playlist 1: Chill Vibes
Sunflower, Post Malone & Swae Lee, 2018
Location, Khalid, 2017
Stay, Rihanna ft. Mikky Ekko, 2012
Gravity, John Mayer, 2006
Skinny Love, Bon Iver, 2007

Playlist 2: Classic Rock
Hotel California, Eagles, 1976
Bohemian Rhapsody, Queen, 1975
Stairway to Heaven, Led Zeppelin, 1971
Dream On, Aerosmith, 1973
Born to Run, Bruce Springsteen, 1975

Playlist 3: Pop Hits
Blinding Lights, The Weeknd, 2019
Levitating, Dua Lipa, 2020
Shake It Off, Taylor Swift, 2014
Uptown Funk, Mark Ronson ft. Bruno Mars, 2014
Firework, Katy Perry, 2010

Playlist 4: Hip-Hop Essentials
Lose Yourself, Eminem, 2002
HUMBLE., Kendrick Lamar, 2017
Juicy, The Notorious B.I.G., 1994
SICKO MODE, Travis Scott, 2018
Ms. Jackson, Outkast, 2000

Playlist 5: Indie Mix
Electric Feel, MGMT, 2007
Dog Days Are Over, Florence + The Machine, 2008
Take Me Out, Franz Ferdinand, 2004
First, Cold War Kids, 2015
Do I Wanna Know?, Arctic Monkeys, 2013

Playlist 6: 80s Throwback
Take On Me, a-ha, 1985
Billie Jean, Michael Jackson, 1982
Sweet Dreams, Eurythmics, 1983
Livin' on a Prayer, Bon Jovi, 1986
Africa, Toto, 1982

Playlist 7: R&B Grooves
No Diggity, Blackstreet, 1996
Ordinary People, John Legend, 2004
Confessions Part II, Usher, 2004
Say My Name, Destiny's Child, 1999
Superstition, Stevie Wonder, 1972

Playlist 8: Country Roads
Take Me Home, Country Roads, John Denver, 1971
Jolene, Dolly Parton, 1973
Friends in Low Places, Garth Brooks, 1990
The Gambler, Kenny Rogers, 1978
Before He Cheats, Carrie Underwood, 2005

Playlist 9: EDM Energy
Animals, Martin Garrix, 2013
Wake Me Up, Avicii, 2013
Clarity, Zedd ft. Foxes, 2012
Titanium, David Guetta ft. Sia, 2011
Don’t You Worry Child, Swedish House Mafia, 2012

Playlist 10: Jazz & Soul
Feeling Good, Nina Simone, 1965
At Last, Etta James, 1960
What a Wonderful World, Louis Armstrong, 1967
Ain’t No Sunshine, Bill Withers, 1971
My Favorite Things, John Coltrane, 1961
```

## Part 2: Student Data

- Below is the roster for a class. Create a class `Student` and a `StudentRunner` with a list of `Students`. 

`roster.csv`
```
S001,Tiffany Gray
S002,Troy Stephens
S003,Nathaniel Hunt
S004,Aaron Hunter
S005,Anthony Peck
S006,Lori Wilson
S007,Margaret Jones
S008,Jeremy Horton
S009,Patrick Salas
S010,Jonathan Perez
S011,Kimberly Adams
S012,Mark Johnson
S013,Victor Mitchell
S014,Joseph Lawson
S015,Joel Mcfarland
S016,Debbie Johnson
```

- Each students grades are in the `student_grades` folder. Create a program to tell me the average grade for each of the 5 classes.
