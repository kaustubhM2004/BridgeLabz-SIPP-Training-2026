public class                                                                                                            fv
{

static int generateOtp()
{
return (int)(Math.random()*900000)+100000;
}

static boolean areOtpsUnique(int otp[])
{

for(int i=0;i<otp.length;i++)
{
for(int j=i+1;j<otp.length;j++)
{
if(otp[i] == otp[j])
return false;
}
}

return true;
}

public static void main(String args[])
{

int otp[] = new int[10];

for(int i=0;i<otp.length;i++)
{
otp[i] = generateOtp();
}

System.out.println("Generated OTPs");

for(int i=0;i<otp.length;i++)
{
System.out.println(otp[i]);
}

if(areOtpsUnique(otp))
System.out.println("All OTPs are Unique");
else
System.out.println("Duplicate OTP Found");

}
}