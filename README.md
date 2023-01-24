# App1Repo
yrnrApp1

First Stable Version - Passing Arguments Between Two Frames.

Simple android app with two fragments.

First fragment loads with textviews showing '1+1' and '2' respectively, and a button 'Me+Me'.

Click the button, first fragment sends the value '2' to second fragment.

Second fragment takes the argument '2' from first fragment. It doubles the value '2' and ...

Second fragment shows the argument in its' textviews as '2+2' and '4' respectively, and a button 'DoubleMe'.

Click this button on second fragment, it will send argument '4' to first fragment.

And it goes on doubling the number, until it becomes as big as a Kotlin's BigInteger data type can hold in memory.
