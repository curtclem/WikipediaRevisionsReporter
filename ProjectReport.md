# Project Report

(Put your name here)

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

## Challenge #1 Complete

I found this first challenge problem to be straight forward. 
My solution to it was simply modifying the configure method in the QueryEngineModule 
to use the WikipediaQueryEngine class instead of the FakeQueryEngine.

## Challenge #2 Incomplete

I was able to create an alternative revision formatter that adjust how the revisions are displayed making them easier to read.
But I wasn't able to incorporate it into the app so that it opposes the flow of execution. I got a little confused on this part.

## Challenge #3 Complete

I used a chain of function calls starting with the stream() method to combine the strings. 

## Reflection Question #1: Functional vs OO

Both are similar in the sense that they accomplish the same thing. 
I personally prefer the iterative approach, mainly because I am more familiar with it compared to using a chain of function calls.
Also I find that the iterative approach is generally easier to read and follow along compared to a single line with function call after function call.

## Reflection Question #2: Polymorphism and Dependency Inversion

Polymorphism is used in this application by having an interface that a Query Engine can inherit from. 
This allows for dependency inversion because the QueryEngineModule is not dependent on the specific query engine 
but rather the abstract QueryEngine interface.


