//package com.example.reviewsite.demo.repository;
//
//import com.example.reviewsite.demo.models.Review;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//public class ReviewRepository {
//
//    Map<Long, Review> reviewList = new HashMap<>();
//
//    public ReviewRepository() {
//        Review review = new Review(1L,"Iron Man Review","./images/iron_man.jpg","Phase: One", "2008", "Iron Man is the first movie to take place in the Marvel Cinematic Universe.  The story follows Tony Stark, owner of military contracted weapons corporation Stark Industries, and his journey to becoming the first Marvel hero Iron Man.  The movie is directed by Jon Favreau and stars Robert Downey Jr., Terrence Howard, Jeff Bridges and Gwyneth Paltrow.\n" + "\n" + "When Marvel Studios announced they were coming out with movies based on Marvel Comics, teenage Allen Haney was beyond excited. As a fan of the Tobey Maguire Spider-Man films I couldn’t wait to see Iron Man. I had never seen any of RDJ’s previous films which allowed me to go in with zero expectations, while others were skeptical based on his past performances and criminal record.\n" + "\n" + "He did not disappoint.  RDJ shows he was born for this role.  His ability to become a brilliant billionaire playboy philanthropist is a performance that rivals any lead role in a superhero film before him. Throughout the film you watch him grow as he is faced with life or death situations and the realization that he may be apart of the problem when it comes to war torn countries.\n" + "\n" + "By the end of the film Tony Stark becomes the Iron Man and kicks off a 23-movie franchise that spans over a decade long, with still no end in sight.  The film does a great job at paying homage to the comic book character while re-inventing him with modern day technology and world issues. Overall this film is still my favorite Marvel origin story. Re-watching still gives me the same excitement for the MCU I felt back in 2008.");
//        Review review2 = new Review(2L,"The Incredible Hulk Review","./images/incredible_hulk.jpg","Phase: One", "2008","The Incredible Hulk is the second installment Marvel Cinematic Universe franchise.  The story follows Bruce Banner, a doctor working in Rio De Janeiro at a soda bottling company.  He is also laying low working to control his emotions and heart rate to avoid turning into the Hulk.  The film is directed by Louis Leterrier and stars Edward Norton, Liv Tyler, Tim Roth and William Hurt.\n" + "\n" + "Having two Marvel movies in the same year seemed unreal.  We had never had two Batman, Superman or Spider-Man films in the same year.  Although this movie introduced the Hulk Marvel didn’t start the story by explaining why Bruce Banner is the Hulk and it was a great decision.  The viewers know who the Hulk is due to the 2003 film and the television film starring Lou Ferrigno.  Edward Norton was a big name and set big expectations for the film.\n" + "\n" + "The Incredible Hulk lacks the magic that MCU films have.  I believe this is just a sign of growing pains that Marvel experienced when they first started out building a cinematic universe.  The characters Bruce Banner and Thunderbolt Ross are the only things that are relevant to future Marvel movies, which is a big deal because most Marvel movies are intertwined and having hidden easter eggs referencing each other.\n" + "\n" + "As a whole; this is a good movie.  Edward Norton does a great job of portraying Bruce Banner even though his negotiations with Marvel lead to him only playing in this role one time.  Watching this movie gives you the perspective of the internal struggle Banner is dealing with and that is something that does carry through the entire saga.  The greatest thing this film did was have a cut scene that for the first time included two comic book characters from different. Needless to say, it blew my mind.");
//        Review review3 = new Review(3L,"Iron Man 2 Review","./images/iron_man_2.jpg","Phase: One","2010", "Iron Man 2 is the first sequel that Marvel produced.  We are blessed with Tony Stark again.  After he revealed his identity at the end of the first movie he is faced with new challenges.  Anton Vanko, who worked with Howard Stark on the arc reactor, has just died and his son Ivan Vanko sees all the attention that Tony Stark is getting as a hero.  Jon Favreau returns as director and stars Robert Downey Jr., Gwyneth Paltrow, Don Cheadle, Scarlett Johansson and Mickey Rourke.\n" + "\n" + "A sequel to a superhero film is something that doesn’t happen often.  And when they do occur it is rare that they satisfy the viewers.  RDJ was the same Tony Stark I knew and love.  Paltrow did an excellent job in her increased role as Tony’s love interest.  But Rourke’s characters as the villain seemed lack luster.  It seemed like a sub plot line when you thought he was the arc reactor technology wielding bad guy.  His first appearance with what seems to be the weapon that will take down Iron Man was the peak of his character.  He took a back seat to other villains like Justin Hammer.  Although Justin Hammer is a good character and it is fun to watch Tony Stark completely own him throughout the film.\n" + "\n" + "It was exciting to see Iron Man back on the big screen and watch the MCU progress forward.  Characters like War Machine and Black Widow make their first appearances and they supported the lead hero by giving the movie a more group feeling.  A feeling that will be utilize in future films to come.\n" + "\n" + "It is nearly impossible for a sequel to overcome the expectations the original creates, and this film fails to do so.  However, it’s still an awesome movie.  RDJ will never be boring to watch as Tony Stark.  Watching multiple superheroes fight side by side was a real treat.");
//        Review review4 = new Review(4L,"Thor Review","./images/thor.jpg","Phase: One", "2011", "Thor introduces the first off-world Marvel hero to the MCU.  It follows the hero Thor as he is sent to earth and striped of his power.  Back home his brother Loki tries to take the throne and Thor is unable to return to help until he proves he is worthy.  The movie is directed by Kenneth Branagh and stars Chris Hemsworth, Natalie Portman, Tom Hiddleston and Anthony Hopkins.\n" + "\n" + "Thor is a character I didn’t know much about growing up.  My father was able to tell me all about him as he read the comic books growing up.  It was exciting to go into a Marvel movie with no prior knowledge of the hero.  Hemsworth was a very little-known actor at the time which help the viewer not identify him as any other character decides Thor.  Portman and Hopkins were established actors and their involvement in this film gave the film a feel that it wasn’t just a superhero movie.  Think about it. Award winning Anthony Hopkins dressing up as a Norse god.  If he’s there, this film must mean business.\n" + "\n" + "Thor was able to introduce the idea that not all heroes come from earth without making it seems science fiction.  The characters seemed to be from another world in space which made it seem like they were aliens and the powers they had made sense for that reason.  It’s a good introduction to a new character but isn’t the caliber of film Iron Man was.");
//        Review review5 = new Review(5L,"Captain America: The First Avenger Review","./images/captain_america.jpg","Phase: One", "2011", "Captain America take place during World War II which is the first time an MCU films takes places in a time other than present day.  Steve Rogers is a small young man with a desire to serve his country.  After failing to enlist several times due to his size, he is presented the opportunity to turn himself into exactly what the military is looking for.  The film is directed by Joe Johnston and stars Chris Evans, Tommy Lee Jones, Hugo Weaving, Hayley Atwell and Sebastian Stan.\n" + "\n" + "In their fifth MCU movie Marvel continued with another origin story.  Chris Evans embodies what it means to be a patriot before he is granted the ability to defend his country.  After his transformation you can’t help being marvel at his abilities.  It is satisfying to see someone who is deserving of the gift he is given.  Tommy Lee Jones had a minor role, but it was perfect for him.  Hugo Weaving plays the villain and it was a treat to watch someone with his acting prowess in a Marvel film.  The crossover of superhero and war movie was executed very well.\n" + "\n" + "As far as carrying the universe forward this film did a lot, and the viewer doesn’t even realize it.  Many characters and aspects from this film were used in serval films that came after it.  At the time I was really surprised by how much I enjoyed it.  Looking back, I appreciate it even more for all that it set up for the MCU.");
//        Review review6 = new Review(6L,"The Avengers Review","./images/avengers.jpg","Phase: One", "2012", "The Avengers is the biggest cross over event of it's time.  Four leading heroes come together to fight a threat that is literally out of this world.  The group struggles to keep their focus on the enemy and instead have their own issues deciding who is best fit to lead the team.  The director is Joss Whedon and the film stars Robert Downey Jr., Chris Evans, Chris Hemsworth, Mark Ruffalo, Scarlett Johansson, Jeremy Renner, Tom Hiddleston and Samuel L Jackson.\n" + "\n" + "In 2012 I attended a Marvel movie marathon that started at noon the day before the release of Marvel's The Avengers.  It included every movie that came before and at midnight we watched Avengers for the first time.  Everyone was stellar.  Seeing heroes on the screen for second time like Hulk, Thor, Captain America was worth the hype.  Bruce Banner was being played by a new actor, Thor seemed to redefine himself as a hero and grow as a character, and Captain America was a soldier trying to get back to civilian life, in a new millennia of course.  They brought the action scenes to the next level.  We got to see Thor fight a lot more than we did in his origin film.  Hulk was a directed warrior instead of a loose cannon.  The greatest scene of all was all six Avengers side by side being lead by Captain America.  Literally the greatest scene in super hero movie history.\n" + "\n" + "Hiddleston is an incredible villain continuing his role as Loki.  The heroes come together and have a historic fight sequence in New York City against an alien army.  The CGI has aged but aged well.  The greatest thing about this movie is that it was the product Marvel Studios was working so hard to create.  A film that took the characters of 4 different stand alone films and putting them together seamlessly.  It's something that had never been accomplished in cinema.  \n" + "\n" + "There is literally nothing I can complain about this movie.  The acting, effects and story were all amazing across the board.  The villain and the idea that threats from outer space could come to earth blew the entire universe wide open.  Nerd's everywhere were speculating what was to come after this film.");
//        Review review7 = new Review(7L,"Iron Man 3 Review","./images/iron_man_3.jpg","Phase: Two", "2013","Iron Man 3, the last movie in Marvel's first trilogy.  Tony Stark is back again.  He is making leaps in his technology and is about to make a big break when it comes to his arc reactor.  He and Pepper are officially and item and everything is going well until a terrorist organization calls Tony's bluff and attacks his Malibu home.  Tony must protect what has become most important while saving the world.  Rather than Jon Favreau like before Shane Black directs the film while Robert Downey Jr., Gweneth Paltrow, Don Cheadle, Guy Pearce, Jon Favreau and Ben Kingsley.\n" + "\n" + "With Avengers in the past Iron Man 3 kicks off Phase Two of the MCU.  With a new director it definitely had a different tone that the first two films.  Something that was this film that was lacking in the sequel was Tony Stark smart side.  This movie illustrates that Tony's greatest weapon isn't his suit, it's his brain.  The special effects progress in a way that keeps it fresh.  You never feel like Iron Man is the same old guy fighting bad guys the same way he did in the last 3 movies he had been in.  It's just never boring to watch Tony Stark/ Iron Man on the big screen.\n" + "\n" + "Although this is the third film.  After a great origin movie kicking off the MCU and The Avengers coming out just a year before it was just impossible to live up to the hype.  This is the first time I had actual complaints about a Marvel film.  First is the villain.  There's a big misdirect in this film and in my opinion it took a lot more away from the film than adding to the plot.  There was a direction I thought they were going and frankly, they should have gone that way.");
//        Review review8 = new Review(8L,"Thor: The Dark World Review","./images/thor_2.jpg","Phase: Two", "2013", "Thor: The Dark World continues with the adventures of Thor.  Thor is back at Asgard while Loki answers for his war crimes on earth.  The Asgardians learn of the Convergence, a alignment of the Nine realms in approaching.  Jane Foster observes strangle scientific anomalies on earth.  The two of them work together to fight a new ancient threat.\n" + "\n" + "You can almost look at this movie as a sequel to Thor and Avengers.  Loki is the same Loki that was just the enemy of earth a couple movies ago and Thor has come so far since his first film he's almost a different person entirely.  It was fun to see Natalie Portman and her gang working with Thor again.  This movie started to bring humor into the movies in a new way.  Hiddleston is amazing yet again as Loki, delivering a performance that Marvel continues to include in their films.  The ending of this film is one of my favorites as it show cases the relationship of Thor and Loki. \n" + "\n" + "The masses didn't know how to react to this movie.  It kinda jumped head first into a comic book story that the MCU hadn't learned about before.  The villian of the movie are exclusive to this film.  Although this film did contribute a big key to the big picture of the MCU.\n");
//        Review review9 = new Review(9L,"Captain America: The Winter Soldier Review","./images/captain_america_2.jpg","Phase: Two", "201", "Lorem");
//        Review review10 = new Review(10L,"Guardians of the Galaxy Review","./images/guardians.jpg","Phase: Two", "201", "Avengers: Age of Ultron is the official sequel to the 2012 Avenger film.  The heroes of the first movie are working together to fight a threat that is working on fighting fire with fire.  Tony and Bruce work together to create a weapon that will be able to protect the world from another alien attack, but it comes back to bite them.  Joss Whedon returns to direct along with stars Robert Downey Jr., Chris Evans, Chris Hemsworth, Mark Ruffalo, Scarlett Johansson, Jeremy Renner, Don Cheadle and many many more.\n" + "\n" + "The movie starts with the team working together to infiltrate an enemy base and it couldn't be any better.  It's awesome to see the team working together seamlessly as if they do it everyday.  Just like the first movie the team does have their issues.  There are disagreements and rivalries that will carry for the years to come.  The villain of the movie, Ultron, is  always staying out of the reach of the Avengers.  Since the excitement of seeing all the heroes was captured in the previous Avengers film Ultron is what took this film to the next level.  Marvel is able to recapture that excitement with a villain that at times seemed invincible.  As far as sequels goes it totally delivers.\n" + "\n" + "This movie sets up a lot of what's to come in Phase Three which is what makes these movies so great.  It includes two of the most powerful heroes the MCU has ever scene.  Scarlett Witch and Vision are huge parts of the end of the saga.  It's crazy to think how Marvel plants these seeds all while knowing how much their stories will grow.");
//        Review review11 = new Review(11L,"Avengers: Age of Ultron Review","./images/age_of_ultron.jpg","Phase: Two", "2015", "Avengers: Age of Ultron is the official sequel to the 2012 Avenger film.  The heroes of the first movie are working together to fight a threat that is working on fighting fire with fire.  Tony and Bruce work together to create a weapon that will be able to protect the world from another alien attack, but it comes back to bite them.  Joss Whedon returns to direct along with stars Robert Downey Jr., Chris Evans, Chris Hemsworth, Mark Ruffalo, Scarlett Johansson, Jeremy Renner, Don Cheadle and many many more.\n" + "\n" + "The movie starts with the team working together to infiltrate an enemy base and it couldn't be any better.  It's awesome to see the team working together seamlessly as if they do it everyday.  Just like the first movie the team does have their issues.  There are disagreements and rivalries that will carry for the years to come.  The villain of the movie, Ultron, is  always staying out of the reach of the Avengers.  Since the excitement of seeing all the heroes was captured in the previous Avengers film Ultron is what took this film to the next level.  Marvel is able to recapture that excitement with a villain that at times seemed invincible.  As far as sequels goes it totally delivers.\n" + "\n" + "This movie sets up a lot of what's to come in Phase Three which is what makes these movies so great.  It includes two of the most powerful heroes the MCU has ever scene.  Scarlett Witch and Vision are huge parts of the end of the saga.  It's crazy to think how Marvel plants these seeds all while knowing how much their stories will grow.");
//        Review review12 = new Review(12L,"Ant-Man Review","./images/ant-man.jpg","Phase: Two", "2015", "Ant-Man caps off Phase Two of the MCU.  Unlike Phase One the Avengers movie wasn't the technical end to this phase.  Ant-man is about former criminal Scott Lang finding himself in the middle of a conflict of scientists.  Hank Pym recruits him to help protect his legacy and stop his shrink suit technology from getting into the wrong hands.  The films director is Peyton Reed and stars Paul Rudd, Evangeline Lilly, Corey Stoll and Michael Douglas.\n" + "\n" + "As far as Marvel movies go this film seems to have little to do with the MCU.  It's a great stand alone movie.  Paul Rudd is hilarious and the movies creators do an amazing job at making Ant-Man not only a real hero but one that has some of the coolest powers you've ever seen.  On the surface it seems like all he can do it shrink down but that ability makes him an amazing hand to hand fighter and makes for dramatic and historical fight sequences.\n" + "\n" + "Without the Marvel trademark this movie would fall under the category of comedy but it's a super hero movie nonetheless.  But with that Marvel trademark and the continued star power talent they can draw in they made another fun and successful film.");
//        Review review13 = new Review(13L,"Captain America: Civil War Review","./images/civil war.jpg","Phase: Three", "2016", "Captain America: Civil War is the last movie in the trilogy.  The US government is writing legislation to real in the heroes and their ability to respond to situations in an attempt to lessen the collateral damage they have caused in the past.  This creates a divide in the Avengers that a secret villain takes advantage of.  The Russo brothers make their Marvel debut as Anthony and Joe Russo direct and Chris Evans, Robert Downey Jr., Scarlett Johansson, Sebastian Stan, Anthony Mackie, Don Cheadle, Jeremy Renner, Chadwick Boseman, Paul Bettany, Elizabeth Olsen, Paul Rudd and Tom Holland.\n" + "\n" + "As you can tell by the cast list this is basically a mini Avengers movie.  The tensions between the team are at an all time high and something from the past pushes them to the edge.  The villain of the movie is almost the heroes themselves as they find themselves throwing punches at each other multiple times.  Of course this movie also introduces Spider-Man for the first time in the MCU.  Something fans like me had been waiting years for.  The acting is top notch.  Chris Evans and RDJ do a great job transitioning their bickering into an all out emotional civil war.\n" + "\n" + "This is hands down the greatest non-Avengers MCU film in my opinion.  It's kind of cheating by including not only four of the original Avengers but five new Avengers.");
//        Review review14 = new Review(14L,"Doctor Strange Review","./images/doctor_strange.jpg","Phase: Three", "2016", "Doctor Strange is another origin film for a new Marvel hero.  Dr. Stephen Strange is a high profile surgeon that is left with nerve damage in his hands after a bad car accident.  The nerves seem to be beyond repair and he is no longer able to practice surgery.  Dr. Strange will stop at nothing to get his hands back, and one method leads him down a rabbit hole he wasn't expecting.  Scott Derrickson directs while the film stars Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams, Benedict Wong, Michael Stuhlbarg and Tilda Swinton.\n" + "\n" + "Doctor Strange's character starts out like a Tony Stark.  He's a brilliant mind with lots of money and a huge ego.  After his accident is seems that his life is taken away from him and he is forced to take a step back and look at the person he really is.  The ancient one played by Tilda Swinton does a good job and being his Mr. Miyagi and showing him how to perfect his new powers.  This movie introduces new forms of powers and magic we haven't seen before and that's exciting.  It's a great origin story of a character that will become a huge part of this phase of the MCU.\n" + "\n" + "Overall I enjoyed Doctor Strange.  It doesn't come to mind when I think of my favorite Marvel films but it has so much acting talent it's hard to find things to complain about.  It is a perfect example of how far origin films have come since the days of Thor when it comes to CGI.");
//        Review review15 = new Review(15L,"Guardians of the Galaxy Vol. 2 Review","./images/guardians_vol2.jpg","Phase: Three", "2017", "Guardians of the Galaxy Vol. 2 is the sequel to the first movie with the same name.  The gang is back together but this time thy're facing a new threat.  Peter Quill is suprised to meet his long lost father, but not all is well when they visit his home planet.  The team must face diversity when the intentions of Quills father come into question.  James Gunn returns to direct as well as starring actors Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel, Bradley Cooper and Kurt Russell.\n" + "\n" + "This film is the rare case of a sequel out doing it's original.  The cast comes back in an opening scene that is an instant classic.  The soundtrack is just as good as the first, the jokes are funnier, and most important of all the characters develop.  For a team of aliens they all seem to become more human in this film.  Starlord breaks out as my personal favorite and his story is given the attention it deserved.  Gamora is given depth and she's no longer just an assassin.  Drax, the character that takes everything literally is made softer as a grieving father.  Groot is reborn and Rocket as well is soften into a furry friend to the other Guardians.\n" + "\n" + "You can't go wrong with a Guardians movie.  If I was going to sit down and watch one it would definitely be Vol 2.  It lacks much advancing of the MCU but makes huge progress for the Guardians themselves.");
//        Review review16 = new Review(16L,"Spider-Man Homecoming Review","./images/spider-man_homecoming.jpg","Phase: Three", "2017", "Spider-Man Homecoming is the first movie dedicated to Peter Parker in the MCU.  High schooler Peter Parker already has experience not only keeping his neighborhood safe but fighting along side Avengers like Iron Man.  He's excited to get more experience working with Tony Stark but needs to be reminded he is a kid in school.  And being a kid in school isn't easy.  Jon Watts directs the film that stars Tom Holland, Michael Keaton, Jon Favreau, Gwyneth Paltrow, Zendaya, Donald Glover, Marisa Tomei and Robert Downey Jr.\n" + "\n" + "Spider-Man was always my favorite super hero growing up.  The Tobey Maguire movies were my first experience with heroes on the big screen and I fell in love.  Tom Holland was the perfect pick for this role.  He's never had another major role so it was easy to immediately think of him as Peter Parker.  His chemistry with RDJ on screen is what really puts the movie over the top.  The overall feel of the movie is similar to that of the Phase Two films.  It has a serious tone but sneaks in a lot of great funny moments without taking away from what is a stake.\n" + "\n" + "Marvel reels in another powerhouse talent in Michael Keaton.  I mean, they got Batman to play a bad guy in a Marvel movie.  And he is sinister.  That mans smile never lets you settle down and get comfortable.  He convinces you he's capable of anything and follows up in his performance.  RDJ has a great cameo in the movie that only adds to the quality of the film and never takes away form the fact that this is Spider-Man's show.\n" + "\n" + "I can't explain how excited I was that Spider-Man finally made it into the MCU.  Tom Holland and this cast did not disappoint in the least.");
//        Review review17 = new Review(17L,"Thor: Ragnarok Review","./images/thor_3.jpg","Phase: Three", "2017", "Thor Ragnarok is the third installment in the Thor saga.  Thor returns to Asgard only to find Loki posing as Odin and his father no where to be found.  After Loki reveals he sent Odin to earth they find him there only to watch him pass away moments later.  Odin's death means Thor's sister Hela will return to take the throne at Asgard.  Thor and Loki team up with an old friend to save Asgard from her reign.  Taika Waititi directs and the movie stars Chris Hemsworth, Tom Hiddleston, Cate Blanchett, Idris Elba, Jeff Goldblum, Anthony Hopkins and Mark Ruffalo.\n" + "\n" + "I've got to say other than Iron Man three, the best marvel films seem to come around the third time.  Captain America Civil War and now Thor Ragnarok.  The Marvel Comedy feel like Guardians reinvented is prevalent in this movie as it mostly takes place on other worlds.  The best part is that Marvel continued their trend of including other Avengers in solo films by putting the Hulk in Thor's third movie.  They have a duel and it's one of the best the MCU has ever created.  I almost forgot, the soundtrack rivals that of the Guardians as well.  My personal favorite part of this movie is Korg, a new hilarious ally of Thor.\n" + "\n" + "Phase Three is where Marvel found their wheelhouse and this film show cases everything that is great about Marvel films.  From the all-star cast, the soundtrack, the action and comedy.  It's the full package; a Marvel Classic.");
//        Review review18 = new Review(18L,"Black Panther Review","./images/black panther.jpg","Phase: Three", "2018", "Black Panther is yet another origin story for a beloved Marvel hero.  T'Challa is the Black Panther and King of Wakanda.  there country in Africa is seen as a third world country, when in reality it is far more advanced than any other country on earth.  Their vibranium technology is something wars have been fought over and many have died for.  Conflict arises when a long lost cousin of T'Challa comes forward and challenges him for the throne.  The movie is directed by Ryan Coogler and stars Chadwick Boseman, Michael B. Jordan, Lupita Nyong'o, Danai Gurira, Martin Freeman and Forest Whitaker.\n" + "\n" + "I don't have to tell you the hype that was around this movie.  After T'Challa's appearance in Civil War the audience was dying to see a Black Panther film, myself included.  This movie takes us tot he beautiful world of Wakanda and introduces us to the game changing medal of vibranium.  Marvel does a great job of giving Black Panthers suit new features that we haven't seen before.  It separates his abilities from the rest.  Boseman does a great job at portraying an honorable man that understand the responsibility that comes with being not only a king but the defender of a country.  It contrasts greatly to the origins of Iron Man and Thor, who are heroes that needed to better themselves in order to be seen as a hero.  T'Challa is that man from the beginning.\n" + "\n" + "Michael B. Jordan however steals the show.  His characters story is one that you sympathize with.  There are points in the movie where you know what he is saying is wrong but you understand where he is coming from.  As the villain he is able to make the audience question who they are rooting for.  There's not wonder this film is the fourth highest grossing movie of all time.\n" + "\n" + "This movie is easily in my Top 5 Marvel Movies.  Once again Marvel creates an excellent hero origin story with an amazing cast, stellar soundtrack and remarkable cinematography.");
//        Review review19 = new Review(19L,"Avengers: Infinity War Review","./images/avengers_infinity_war.jpg","Phase: Three", "2018", "Avengers Infinity War is the third movie in the Avengers Saga.  The threat is here.  Thanos is done hiding in the shadows controlling the puppets.  It's time to take care of it himself.  The team for the first time is not together.  The wounds from the events of Civil War are still fresh and the team aren't on speaking terms.  This only makes it easier for Thanos to start collecting stones on his way to correcting this universe. The Russo brothers return to direct and with them the stars Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Elizabeeth Olsen, Anthony Mackie, Sebastian Stan, Dave Bautista, Zoe Saldana, Josh Brolin and Chris Pratt.\n" + "\n" + "The fact that the last person listed is Chris Pratt should tell you all you need to know about this film.  The single largest crossover film of all time.  Characters from eight different films are brought together to fight one common enemy.  This film starts off illustating the true power of Thanos and clear sets the stakes at a new level.  The entire universe is at stake and the Russo brothers never let you forget.\n" + "\n" + "Josh Brolin is finally given the screen time Thanos deserves and he takes advantage of every second.  His performance never once reminded me that is was Josh Brolin behind that purple giant.  For the first time the heroes were losing.  The movie has your heart racing from the very beginning and you find yourself on a roller-coaster of emotions.  The heroes constantly take one step foward and two steps back.\n" + "\n" + "At the time of release this was my favorite Marvel movie yet.  It had everything.  Including something no other Marvel movie had to this point.  It left me not wanting more but needing more.");
//        Review review20 = new Review(20L,"Ant-Man and the Wasp Review","./images/ant-man_the-wasp.jpg","Phase: Three", "2018", "Ant-Man and the Wasp is the sequel to Ant-Man.  Taking place before the events of Infinity War Scott Lang is on house arrest for his participation in the events of Civil War.  Although he is forbidden from leaving his home Hank Pym and his daughter Hope are in need of his help again.  They help him escape his own home and fill him in on the quantum realm and why they need to go there.  Directed by Peyton Reed and starring Paul Rudd, Evangeline Lilly, Michael Pena, Walton Goggins, Bobby Cannavale, Judy Greer, Michelle Pfeiffer and Michael Douglas.\n" + "\n" + "Another Ant-Man movie and another Marvel Comedy.  Paul Rudd continues to be a lovable hero and his friends continue to bring a smile to my face.  It has a lot of the same feel as the first Ant-Man and in every right way.  It's hilarious.  The major difference is that this film did a lot more for the MCU than the first one did.  The introduction to the quantum realm is similar to Black Panthers introduction to vibranium.  They both take the MCU to the next level.  The most important thing this movie did was in it's cut scene.  It leads the viewers perfectly into the fourth Avengers movie that was to come and allowed the nerds to speculate to their hearts desire.\n" + "\n" + "This movie is what is it.  It's a great comedy that takes place within the MCU.  It's not on the same level as an Avenger film but it holds up to the same standard Marvel has created for themselves in Phase Three.");
//        Review review21 = new Review(21L,"Captain Marvel Review","./images/captain_marvel.jpg","Phase: Three", "2019", "Captain Marvel is the second MCU film to take place in the past.  Vers is a member of an elite squad known as Starforce.  She has abilities that aren't quite known that make her an excellent advocate for justice.  She finds herself crashed on planet earth in the early 90s.  While she attempts to find her way home she finds out more about her past and even something more about the leader of her team.  Co-directed by Anna Boden and Ryan Fleck. Starring Brie Larson, Samuel L Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Jude Law and Annette Bening.\n" + "\n" + "Captain Marvel is yet another origin story to introduce a new hero.  The 90s theme is something we haven't seen before in a Marvel film and was refreshing to see characters we love in a different time.  Going in I didn't know much about the character which made the movie a kind of a mystery mixed with a episode of Law and Order.  I found myself trying to figure out what was really going on with Captain Marvel and who the bad guys really were.\n" + "\n" + "The movie overall has a serious tone.  It did well at including comedy like they always do but you never forgot what was at stake.  Brie Larson, an Oscar winner, is great as a lead Marvel hero.  I left the movie wanting to know even more about her back story.  I felt that we only got half of why she is who she is.  But that's the great thing about Marvel Movies.  They always leave you wanting more.");
//        Review review22 = new Review(22L,"Avengers: Endgame Review","./images/endgame.jpg","Phase: Three", "2019", "Avengers Endgame is the fourth movie in the Avengers Saga and bigger than ever before.  The movies takes place five years after the events of Infinity War and the heroes are defeated to say the least.  They are separated.  They are upset.  They are grieving.  They come together to find Thanos and figure out a way to reverse the tragedy that occurred five years ago.  The Russo brothers return to direct and with them the stars Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Brie Larson, Elizabeeth Olsen, Anthony Mackie, Sebastian Stan, Dave Bautista, Zoe Saldana, Josh Brolin and Chris Pratt.\n" + "\n" + "Here we go again.  Just one year after the largest crossover event were adding yet another hero to the mix to make it nine films worth of characters coming together.  This movie is truly an homage to the entire collection of MCU films.  There are constant reminders of the events of the past.  Chris Evans and RDJ work over all these years has come down to this.  The two of them are perfect on screen together.  The weight that is on each of their shoulders can be felt throughout the entire film.  You'll laugh, you'll cry.  You'll enjoy the most rewarding movie watching experience of all time after watching 22 films over 11 years.\n" + "\n" + "There truly couldn't have been a better way to end such an amazing Saga.  22 movies that tie together so well finally coming to a close.  I truly don't know if they'll be able to do it again.");
//        Review review23 = new Review(23L,"Spider-Man Far From Home Review","./images/spider-man_far_from_home.jpg","Phase: Three", "2019", "COMING SOON");
//        Review review24 = new Review(24L,"Black Widow","./images/black_widow.jpg","Phase: Three", "2020", "COMING SOON");
//
//        reviewList.put(review.getId(), review);
//        reviewList.put(review2.getId(), review2);
//        reviewList.put(review3.getId(), review3);
//        reviewList.put(review4.getId(), review4);
//        reviewList.put(review5.getId(), review5);
//        reviewList.put(review6.getId(), review6);
//        reviewList.put(review7.getId(), review7);
//        reviewList.put(review8.getId(), review8);
//        reviewList.put(review9.getId(), review9);
//        reviewList.put(review10.getId(), review10);
//        reviewList.put(review11.getId(), review11);
//        reviewList.put(review12.getId(), review12);
//        reviewList.put(review13.getId(), review13);
//        reviewList.put(review14.getId(), review14);
//        reviewList.put(review15.getId(), review15);
//        reviewList.put(review16.getId(), review16);
//        reviewList.put(review17.getId(), review17);
//        reviewList.put(review18.getId(), review18);
//        reviewList.put(review19.getId(), review19);
//        reviewList.put(review20.getId(), review20);
//        reviewList.put(review21.getId(), review21);
//        reviewList.put(review22.getId(), review22);
//        reviewList.put(review23.getId(), review23);
//        reviewList.put(review24.getId(), review24);
//
//    }
//
//    public Collection<Review> findAll() {
//
//        return reviewList.values();
//    }
//
//    public Review findOne(long id) {
//
//        return reviewList.get(id);
//    }
//
//
//}