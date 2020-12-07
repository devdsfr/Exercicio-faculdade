program MemoryLeakDelphi;

uses
  Vcl.Forms,
  uFrmPrincipal in 'uFrmPrincipal.pas' {Form1},
  uSistema in 'uSistema.pas',
  uVenda in 'uVenda.pas',
  uVendaItem in 'uVendaItem.pas';

{$R *.res}

begin
  Application.Initialize;
  ReportMemoryLeaksOnShutdown  := True;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
