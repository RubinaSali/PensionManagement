import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { MenuComponent } from './pages/menu/menu.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PersonalDetailComponent } from './pages/personal-detail/personal-detail.component';
import { AccountDetailComponent } from './pages/account-detail/account-detail.component';
import { PensionStatementComponent } from './pages/pension-statement/pension-statement.component';
import { AccountStatementComponent } from './pages/account-statement/account-statement.component';
import { ResetPasswordComponent } from './pages/reset-password/reset-password.component';
import { LamboComponent } from './page-2/lambo/lambo.component';
import { HttpClientModule } from '@angular/common/http';
import { ApiService } from './services/api.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    MenuComponent,
    DashboardComponent,
    PersonalDetailComponent,
    AccountDetailComponent,
    PensionStatementComponent,
    AccountStatementComponent,
    ResetPasswordComponent,
    LamboComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
