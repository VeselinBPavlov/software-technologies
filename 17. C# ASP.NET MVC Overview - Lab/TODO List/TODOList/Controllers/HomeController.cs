using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
namespace TODOList.Controllers
{
    using TODOList.Models;

    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            using (var db = new TaskDbContext())
            {
                var tasks = db.Tasks.ToList();
                return View(tasks);
            }
        }       
    }
}
