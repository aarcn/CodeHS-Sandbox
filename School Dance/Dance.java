{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class Dance\
\{\
   // Constants\
   public final int GoldPass = 0;\
   public final int SilverPass = 2;\
   public final int BronzePass = 4;\
   public final int NoPass = 6;\
   \
   // Instance Variables\
   private int attendance;\
   private double ticketSales;\
\
   // Constructors\
   public Dance()\
   \{\
        attendance = 0;\
        ticketSales = 0.0;\
   \}\
   \
   // Methods\
\
   /** precondition:  value of code is in the range (1 to 4) inclusive.\
    *  postcondition: updates the ticketSales by the price of the ticket \
    *     specified by the parameter code. The attendance variable is \
    *     incremented by one.\
    *  @param code a value from (1 - 4) indicating the type of ticket\
    */\
   public void buyTicket(int code)\
   \{\
    switch(code)\
    \{\
        case 1:\
            ticketSales += GoldPass;\
            break;\
        case 2:\
            ticketSales += SilverPass;\
            break;\
        case 3:\
            ticketSales += BronzePass;\
            break;\
        case 4:\
            ticketSales += NoPass;\
            break;\
            default:\
    \}\
attendance ++;\
   \}\
\
   /** @return the value of attendance\
    */\
   public int getAttendance()\
   \{\
      return attendance;\
   \}\
   \
   /** @return the amount of ticketSales\
    */\
   public double getTicketSales()\
   \{\
      return ticketSales;\
   \} \
\}}