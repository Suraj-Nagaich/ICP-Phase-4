class GfG
{
    int[] seg;
    void build(int arr[], int idx, int l, int r)
    {
        if(l == r)
        {
            seg[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr, 2 * idx + 1, l, mid);
        build(arr, 2 * idx + 2, mid + 1, r);
        seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
    }
    int query(int idx, int l, int r, int ql, int qr)
    {
        if(qr < l || ql > r) return Integer.MAX_VALUE;
        if(ql <= l && r <= qr) return seg[idx];
        int mid = (l + r) / 2;
        return Math.min(
            query(2 * idx + 1, l, mid, ql, qr),
            query(2 * idx + 2, mid + 1, r, ql, qr)
        );
    }
    int[] constructST(int arr[], int n)
    {
        seg = new int[4 * n];
        build(arr, 0, 0, n - 1);
        return seg;
    }
    int RMQ(int st[],int n,int l, int r)
    {
        seg = st;
        return query(0, 0, n - 1, l, r);
    }
}
