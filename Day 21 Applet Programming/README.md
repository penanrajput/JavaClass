Applet Programming

**Topics:**

Only four methods are important

1.  **Draw Method**

2.  **Fill Method**

3.  **Color Method (awt package)**

4.  **Font Method (awt package)**

5.  **LifeCycle Methods**

## Screenshots:

+----------------+----------------+----------------+----------------+
| **Subtopics**  | **Subtopics    | **Code**       | **Screenshot** |
|                | List**         |                |                |
+================+================+================+================+
|                | Basic          | ![](medi       | ![](medi       |
|                | Structure of   | a\image1.png){ | a\image2.png){ |
|                | Applet         | width="2.75694 | width="1.28819 |
|                |                | 44444444446in" | 44444444444in" |
|                |                | h              | he             |
|                |                | eight="1.60674 | ight="2.165972 |
|                |                | 5406824147in"} | 2222222224in"} |
+----------------+----------------+----------------+----------------+
| Draw Methods   | DrawString     | ![](med        | ![](media      |
|                |                | ia\image3.png) | \image4.png){w |
|                |                | {width="2.6652 | idth="1.475in" |
|                |                | 77777777778in" | heig           |
|                |                | heigh          | ht="2.0125in"} |
|                |                | t="1.38125in"} |                |
+----------------+----------------+----------------+----------------+
|                | DrawRect       |                |                |
+----------------+----------------+----------------+----------------+
|                | DrawRoundRect  |                |                |
+----------------+----------------+----------------+----------------+
|                | DrawOval       |                |                |
+----------------+----------------+----------------+----------------+
|                | DrawArc        |                |                |
+----------------+----------------+----------------+----------------+
| Fill Method    | FillRect       |                |                |
|                |                |                |                |
|                | FillRoundRect  |                |                |
|                |                |                |                |
|                | FillOval       |                |                |
|                |                |                |                |
|                | FillArc        |                |                |
+----------------+----------------+----------------+----------------+
| Color Method   | Two methods    |                |                |
|                | colorize it    |                |                |
|                |                |                |                |
|                | 1\. Color      |                |                |
|                | Predefined     |                |                |
|                |                |                |                |
|                | // there are   |                |                |
|                | 16 predefined  |                |                |
|                | values         |                |                |
|                |                |                |                |
|                | g.setCo        |                |                |
|                | lor(Color.RED) |                |                |
|                |                |                |                |
|                | 2\. Color User |                |                |
|                | Defined        |                |                |
|                |                |                |                |
|                | Syntax         |                |                |
|                |                |                |                |
|                | g.setColor(new |                |                |
|                | Color(int red, |                |                |
|                | int green, int |                |                |
|                | blue))         |                |                |
|                |                |                |                |
|                | Example        |                |                |
|                |                |                |                |
|                | g.setColor(new |                |                |
|                | Color(255, 0,  |                |                |
|                | 0))            |                |                |
+----------------+----------------+----------------+----------------+
| Font Method    | Syntax:        |                |                |
|                |                |                |                |
|                | new            |                |                |
|                | Font(String    |                |                |
|                | fontname,      |                |                |
|                | style, int     |                |                |
|                | pointsize)     |                |                |
|                |                |                |                |
|                | // style       |                |                |
|                | values         |                |                |
|                |                |                |                |
|                | Font.Plain = 0 |                |                |
|                |                |                |                |
|                | Font.BOLD = 1  |                |                |
|                |                |                |                |
|                | Font.ITALICS = |                |                |
|                | 2              |                |                |
|                |                |                |                |
|                | Font.BOLD +    |                |                |
|                | Font.ITALICS = |                |                |
|                | 3              |                |                |
+----------------+----------------+----------------+----------------+
| Life Cycle     | init()         |                |                |
| Methods        |                |                |                |
|                | start()        |                |                |
|                |                |                |                |
|                | stop()         |                |                |
|                |                |                |                |
|                | destroy()      |                |                |
+----------------+----------------+----------------+----------------+
