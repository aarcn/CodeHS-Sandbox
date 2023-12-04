bplist00�_WebMainResource�	
_WebResourceFrameName_WebResourceData_WebResourceMIMEType_WebResourceTextEncodingName^WebResourceURLPO$�<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="2299.7">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica; min-height: 14.0px}
    span.Apple-tab-span {white-space:pre}
  </style>
</head>
<body>
<p class="p1">import java.util.*;</p>
<p class="p2"><br></p>
<p class="p1">public class StudentCouncil</p>
<p class="p1">{<span class="Apple-converted-space"> </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>// Instance Variables</p>
<p class="p1"><span class="Apple-converted-space">    </span>private Dance dance;</p>
<p class="p1"><span class="Apple-converted-space">    </span>private Scanner scan;</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>// Constructor</p>
<p class="p1"><span class="Apple-converted-space">    </span>public StudentCouncil()</p>
<p class="p1"><span class="Apple-converted-space">    </span>{</p>
<p class="p1"><span class="Apple-converted-space">        </span>dance = new Dance();</p>
<p class="p1"><span class="Apple-converted-space">        </span>scan = new Scanner(System.in);</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>// Methods</p>
<p class="p1"><span class="Apple-converted-space">    </span>public void mainMenu()</p>
<p class="p1"><span class="Apple-converted-space">    </span>{</p>
<p class="p1"><span class="Apple-converted-space">        </span>int num = 0;</p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">        </span>do</p>
<p class="p1"><span class="Apple-converted-space">        </span>{</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("<span class="Apple-converted-space">        </span>Main Menu");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("1. Buy a Ticket");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("2. Print Summary Report");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println("3. Exit");</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println();</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.print("Selection --&gt; ");</p>
<p class="p1"><span class="Apple-converted-space">            </span>num = scan.nextInt();</p>
<p class="p1"><span class="Apple-converted-space">            </span>System.out.println();</p>
<p class="p2"><span class="Apple-converted-space">            </span></p>
<p class="p1"><span class="Apple-converted-space">            </span>if(num == 1)</p>
<p class="p1"><span class="Apple-converted-space">            </span>{</p>
<p class="p1"><span class="Apple-converted-space">                </span>buyTicket();</p>
<p class="p1"><span class="Apple-converted-space">            </span>}</p>
<p class="p1"><span class="Apple-converted-space">            </span>else if (num == 2)</p>
<p class="p1"><span class="Apple-converted-space">            </span>{</p>
<p class="p1"><span class="Apple-converted-space">                </span>printSummary();</p>
<p class="p1"><span class="Apple-converted-space">            </span>}</p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">        </span>}</p>
<p class="p1"><span class="Apple-converted-space">        </span>while(num != 3);</p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>/** precondition:<span class="Apple-converted-space">  </span>none</p>
<p class="p1"><span class="Apple-converted-space">     </span>*<span class="Apple-converted-space">  </span>postcondition: prints a menu of ticket options and allows the<span class="Apple-converted-space"> </span></p>
<p class="p1"><span class="Apple-converted-space">     </span>* <span class="Apple-converted-space">    </span>user to select one of the items in the menu. It purchases<span class="Apple-converted-space"> </span></p>
<p class="p1"><span class="Apple-converted-space">     </span>* <span class="Apple-converted-space">    </span>a ticket according to ticket type selected.</p>
<p class="p1"><span class="Apple-converted-space">     </span>*/</p>
<p class="p1"><span class="Apple-converted-space">    </span>public void buyTicket()</p>
<p class="p1"><span class="Apple-converted-space">    </span>{<span class="Apple-converted-space">       </span></p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("<span class="Apple-converted-space">        </span>Buy Ticket");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("1. Gold Pass");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("2. Silver Pass");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("3. Bronze Pass");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("4. No Pass");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.print("Selection --&gt; ");</p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">        </span>int ticketType = scan.nextInt();</p>
<p class="p1"><span class="Apple-converted-space">        </span>dance.buyTicket(ticketType); <span class="Apple-converted-space">       </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>/** precondition:<span class="Apple-converted-space">  </span>none</p>
<p class="p1"><span class="Apple-converted-space">     </span>*<span class="Apple-converted-space">  </span>postcondition: prints a summary report that includes the</p>
<p class="p1"><span class="Apple-converted-space">     </span>* <span class="Apple-converted-space">    </span>current number of students attending the dance and the<span class="Apple-converted-space"> </span></p>
<p class="p1"><span class="Apple-converted-space">     </span>* <span class="Apple-converted-space">    </span>current amount of money made from ticket sales.</p>
<p class="p1"><span class="Apple-converted-space">     </span>*/<span class="Apple-converted-space">   </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>public void printSummary()</p>
<p class="p1"><span class="Apple-converted-space">    </span>{</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("<span class="Apple-converted-space">    </span>Summary Report");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("======================");</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("Total Attendance = " + dance.getAttendance());</p>
<p class="p1"><span class="Apple-converted-space">        </span>System.out.println("Total Ticket Sales = $" + dance.getTicketSales());</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p2"><span class="Apple-tab-span">	</span></p>
<p class="p1"><span class="Apple-converted-space">    </span>public static void main(String[] args)</p>
<p class="p1"><span class="Apple-converted-space">    </span>{</p>
<p class="p1"><span class="Apple-converted-space">        </span>StudentCouncil app = new StudentCouncil();</p>
<p class="p1"><span class="Apple-converted-space">        </span>app.mainMenu();</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p1">}</p>
</body>
</html>
Ytext/htmlUutf-8_file:///index.html    ( ? Q g � � �%S%]%c                           %x