int __fastcall main(int argc, const char **argv, const char **envp)
{
  unsigned int v3; // eax
  unsigned int v5; // [rsp+4h] [rbp-3Ch]
  void *ptr; // [rsp+8h] [rbp-38h]
  FILE *stream; // [rsp+10h] [rbp-30h]
  char buf[16]; // [rsp+20h] [rbp-20h] BYREF
  unsigned __int16 v9; // [rsp+30h] [rbp-10h]
  unsigned __int64 v10; // [rsp+38h] [rbp-8h]

  v10 = __readfsqword(0x28u);
  init(argc, argv, envp);
  ptr = malloc(0x20uLL);
  stream = fopen("flag", "r");
  if ( stream )
  {
    fread(ptr, 1uLL, 0x15uLL, stream);
    fclose(stream);
  }
  buf[0] = 0LL;
  buf[1] = 0LL;
  v9 = 0x1337;
  printf("Enter challenger's name: ");
  *((_BYTE *)buf + (int)read(0, buf, 0x10uLL) + 1) = 0;
  v3 = time(0LL);
  srand(v3);
  printf(buf);
  v5 = rand() % 2025;
  if ( v5 <= v9 )
  {
    puts("There is no problem with my program!");
    printf("Your Score: %d\n", v5);
  }
  else
  {
    you_win();
  }
  return 0;
}