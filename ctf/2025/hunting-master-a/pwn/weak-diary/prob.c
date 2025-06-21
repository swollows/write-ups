int __fastcall __noreturn main(int argc, const char **argv, const char **envp)
{
  int i; // [rsp+8h] [rbp-8h]
  int choice; // [rsp+Ch] [rbp-4h]

  for ( i = 0; i <= 8; ++i )
  {
    if ( *(_BYTE *)(((unsigned __int64)&diaries[i] >> 3) + 0x7FFF8000) )
      __asan_report_store8(&diaries[i]);
    diaries[i] = 0LL;
    if ( *(_BYTE *)(((unsigned __int64)&diary_sizes[i] >> 3) + 0x7FFF8000) )
      __asan_report_store8(&diary_sizes[i]);
    diary_sizes[i] = 0LL;
  }
  while ( 1 )
  {
    while ( 1 )
    {
      print_menu();
      choice = read_int();
      if ( choice != 2025 )
        break;
      secret();
    }
    if ( choice > 2025 )
      goto LABEL_21;
    if ( choice == 4 )
    {
      puts("Bye!");
      __asan_handle_no_return("Bye!", argv);
      exit(0);
    }
    if ( choice > 4 )
    {
LABEL_21:
      puts("Invalid choice");
    }
    else
    {
      switch ( choice )
      {
        case 3:
          modify_diary();
          break;
        case 1:
          add_diary();
          break;
        case 2:
          read_diary();
          break;
        default:
          goto LABEL_21;
      }
    }
  }
}

void __cdecl print_menu()
{
  puts("====== DIARY MENU ======");
  puts("1. Add Diary");
  puts("2. Read Diary");
  puts("3. Modify Diary");
  puts("4. Exit");
  puts("???. Secret");
  printf("Choice: ");
  if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
    __asan_report_load8(&stdout);
  fflush(stdout);
}

void __cdecl secret()
{
  unsigned __int64 addr; // [rsp+8h] [rbp-18h] BYREF
  uint32_t *p; // [rsp+10h] [rbp-10h]
  unsigned __int64 v2; // [rsp+18h] [rbp-8h]

  v2 = __readfsqword(0x28u);
  if ( diary_count > 8 )
  {
    printf("Secret Address: ");
    fflush(stdout);
    addr = 0LL;
    if ( (unsigned int)__isoc99_scanf("%lu", &addr) != 1 )
      error_exit();
    p = (uint32_t *)addr;
    *(_DWORD *)addr = 0;
    puts("Secret applied.");
  }
  else
  {
    puts("Secret not available yet.");
  }
}

int __cdecl read_int()
{
  unsigned __int64 v0; // rbx
  __int64 v1; // rax
  unsigned __int64 v2; // r12
  int v3; // edx
  _BYTE v5[88]; // [rsp+0h] [rbp-80h] BYREF
  unsigned __int64 v6; // [rsp+58h] [rbp-28h]

  v0 = (unsigned __int64)v5;
  if ( edata )
  {
    v1 = __asan_stack_malloc_0(64LL);
    if ( v1 )
      v0 = v1;
  }
  *(_QWORD *)v0 = 1102416563LL;
  *(_QWORD *)(v0 + 8) = "1 32 4 4 x:32";
  *(_QWORD *)(v0 + 16) = read_int;
  v2 = v0 >> 3;
  *(_DWORD *)(v2 + 2147450880) = -235802127;
  *(_DWORD *)(v2 + 2147450884) = -202116348;
  v6 = __readfsqword(0x28u);
  if ( (unsigned int)__isoc99_scanf(off_4120, v0 + 32) != 1 )
    error_exit();
  if ( *(_BYTE *)(((v0 + 32) >> 3) + 0x7FFF8000) != 0 && *(_BYTE *)(((v0 + 32) >> 3) + 0x7FFF8000) <= 3 )
    __asan_report_load4(v0 + 32);
  v3 = *(_DWORD *)(v0 + 32);
  if ( v5 == (_BYTE *)v0 )
  {
    *(_QWORD *)((v0 >> 3) + 0x7FFF8000) = 0LL;
  }
  else
  {
    *(_QWORD *)v0 = 1172321806LL;
    *(_QWORD *)((v0 >> 3) + 0x7FFF8000) = 0xF5F5F5F5F5F5F5F5LL;
    **(_BYTE **)(v0 + 56) = 0;
  }
  return v3;
}

void __cdecl modify_diary()
{
  int idx; // [rsp+4h] [rbp-1Ch]
  char *ptr; // [rsp+8h] [rbp-18h]
  size_t size; // [rsp+10h] [rbp-10h]

  printf("Index: ");
  if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
    __asan_report_load8(&stdout);
  fflush(stdout);
  idx = read_int();
  if ( idx < 0 || idx >= diary_count )
    error_exit();
  if ( *(_BYTE *)(((unsigned __int64)&diaries[idx] >> 3) + 0x7FFF8000) )
    __asan_report_load8(&diaries[idx]);
  ptr = (char *)diaries[idx];
  if ( *(_BYTE *)(((unsigned __int64)&diary_sizes[idx] >> 3) + 0x7FFF8000) )
    __asan_report_load8(&diary_sizes[idx]);
  size = diary_sizes[idx];
  printf("New Content: ");
  if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
    __asan_report_load8(&stdout);
  fflush(stdout);
  read_until_nl(ptr, size + 16);
  puts("Diary modified.");
}

void __cdecl add_diary()
{
  int v0; // eax
  size_t v1; // rcx
  int v2; // eax
  int size; // [rsp+Ch] [rbp-24h]
  char *ptr; // [rsp+18h] [rbp-18h]
  unsigned __int64 read_len; // [rsp+20h] [rbp-10h]

  if ( diary_count <= 8 )
  {
    printf("Size (multiple of 16): ");
    if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
      __asan_report_load8(&stdout);
    fflush(stdout);
    size = read_int();
    if ( size <= 0 || (size & 0xF) != 0 || size > 1023 )
      error_exit();
    ptr = (char *)malloc(size + 16LL);
    if ( !ptr )
      error_exit();
    printf("Content: ");
    if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
      __asan_report_load8(&stdout);
    fflush(stdout);
    read_len = read_until_nl(ptr, size);
    if ( size > read_len )
      memset(&ptr[read_len], 0, size - read_len);
    v0 = diary_count;
    v1 = size;
    if ( *(_BYTE *)(((unsigned __int64)&diary_sizes[diary_count] >> 3) + 0x7FFF8000) )
      v0 = __asan_report_store8(&diary_sizes[diary_count]);
    diary_sizes[v0] = v1;
    if ( *(_BYTE *)(((unsigned __int64)&ptr[size] >> 3) + 0x7FFF8000) )
      __asan_report_store8(&ptr[size]);
    *(_QWORD *)&ptr[size] = print_daily;
    v2 = diary_count;
    if ( *(_BYTE *)(((unsigned __int64)&diaries[diary_count] >> 3) + 0x7FFF8000) )
      v2 = __asan_report_store8(&diaries[diary_count]);
    diaries[v2] = ptr;
    printf("Diary %d added (size %d).\n", diary_count, size);
    ++diary_count;
  }
  else
  {
    puts("No more diary slots available.");
  }
}

void __cdecl read_diary()
{
  int idx; // [rsp+4h] [rbp-1Ch]
  char *ptr; // [rsp+8h] [rbp-18h]
  size_t size; // [rsp+10h] [rbp-10h]

  printf("Index: ");
  if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
    __asan_report_load8(&stdout);
  fflush(stdout);
  idx = read_int();
  if ( idx < 0 || idx >= diary_count )
    error_exit();
  if ( *(_BYTE *)(((unsigned __int64)&diaries[idx] >> 3) + 0x7FFF8000) )
    __asan_report_load8(&diaries[idx]);
  ptr = (char *)diaries[idx];
  if ( *(_BYTE *)(((unsigned __int64)&diary_sizes[idx] >> 3) + 0x7FFF8000) )
    __asan_report_load8(&diary_sizes[idx]);
  size = diary_sizes[idx];
  printf("Content: ");
  if ( *(_BYTE *)(((unsigned __int64)&stdout >> 3) + 0x7FFF8000) )
    __asan_report_load8(&stdout);
  fwrite(ptr, 1uLL, size, stdout);
  putchar(10);
  if ( *(_BYTE *)(((unsigned __int64)&ptr[size] >> 3) + 0x7FFF8000) )
    __asan_report_load8(&ptr[size]);
  (*(void (**)(void))&ptr[size])();
  free(ptr);
  puts("Diary freed.\n");
}