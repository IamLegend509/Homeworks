class TriangleArea
{
    int base,height,s1,s2,s3;
    double area;
    void Area(int b,int h)
    {
        base=b;
        height=h;
        area= base*height/2;
    }
    void Area(int a,int b,int c)
    {
        s1=a;
        s2=b;
        s3=c;
        int s= s1+s2+s3;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    public static void main(int b,int h,int a1,int a2,int a3)
    {
        TriangleArea o= new TriangleArea();
        o.Area(b,h);
        o.Area(a1,a2,a3);
    }
}